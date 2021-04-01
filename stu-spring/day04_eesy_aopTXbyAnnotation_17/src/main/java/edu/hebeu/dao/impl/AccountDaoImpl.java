package edu.hebeu.dao.impl;

import edu.hebeu.dao.IAccountDao;
import edu.hebeu.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * JdbcDaoSupport类型内有类成员属性：
 *  private JdbcTemplate jdbcTemplate;
 */
@Repository("accountDao")
public class AccountDaoImpl implements IAccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void updateAccount(Account account) {
        jdbcTemplate.update("UPDATE account SET name = ?, money = ? WHERE id = ?",
                account.getName(), account.getMoney(), account.getId());
    }

    public Account selectAccountById(Integer accountId) {
        List<Account> accounts = jdbcTemplate.query("SELECT id, name, money FROM account WHERE id = ?",
                new BeanPropertyRowMapper<Account>(Account.class),
                accountId);
        if (accounts.isEmpty()) {
            return null;
        }
        return accounts.get(0);
    }

    public Account selectAccountByName(String accountName) {
        List<Account> accounts = jdbcTemplate.query("SELECT id, name, money FROM account WHERE name = ?",
                new BeanPropertyRowMapper<Account>(Account.class),
                accountName);
        if (accounts.isEmpty()) {
            return null;
        }
        if (accounts.size() > 1) {
            throw new RuntimeException("edu.hebeu.dao.impl.AccountDaoImpl.selectAccountByName()方法异常！");
        }
        return accounts.get(0);
    }
}

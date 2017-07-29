package com.toceansoft.permission.cas.dao;

import com.toceansoft.permission.cas.entity.Role;

/**
 * <p>User: Narci Lee
 * <p>Date: 17-7-29
 * <p>Version: 1.0
 */
public interface RoleDao {

    public Role createRole(Role role);
    public void deleteRole(Long roleId);

    public void correlationPermissions(Long roleId, Long... permissionIds);
    public void uncorrelationPermissions(Long roleId, Long... permissionIds);

}

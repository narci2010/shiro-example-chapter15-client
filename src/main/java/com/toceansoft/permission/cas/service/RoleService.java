package com.toceansoft.permission.cas.service;

import com.toceansoft.permission.cas.entity.Role;

/**
 * <p>User: Narci Lee
 * <p>Date: 17-7-29
 * <p>Version: 1.0
 */
public interface RoleService {


    public Role createRole(Role role);
    public void deleteRole(Long roleId);

    /**
     * 添加角色-权限之间关系
     * @param roleId
     * @param permissionIds
     */
    public void correlationPermissions(Long roleId, Long... permissionIds);

    /**
     * 移除角色-权限之间关系
     * @param roleId
     * @param permissionIds
     */
    public void uncorrelationPermissions(Long roleId, Long... permissionIds);

}

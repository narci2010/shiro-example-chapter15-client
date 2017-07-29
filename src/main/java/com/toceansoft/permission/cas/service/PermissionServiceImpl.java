package com.toceansoft.permission.cas.service;

import com.toceansoft.permission.cas.dao.PermissionDao;
import com.toceansoft.permission.cas.entity.Permission;

/**
 * <p>User: Narci Lee
 * <p>Date: 17-7-29
 * <p>Version: 1.0
 */
public class PermissionServiceImpl implements PermissionService {

    private PermissionDao permissionDao;

    public void setPermissionDao(PermissionDao permissionDao) {
        this.permissionDao = permissionDao;
    }

    public Permission createPermission(Permission permission) {
        return permissionDao.createPermission(permission);
    }

    public void deletePermission(Long permissionId) {
        permissionDao.deletePermission(permissionId);
    }
}

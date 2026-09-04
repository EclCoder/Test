package com.google.api.client.util.store;

import com.google.api.client.util.IOUtils;
import com.google.api.client.util.Maps;
import com.google.common.collect.c0;
import com.google.common.collect.g0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntryPermission;
import java.nio.file.attribute.AclEntryType;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class FileDataStoreFactory extends AbstractDataStoreFactory {
    private final File dataDirectory;
    private static final Logger LOGGER = Logger.getLogger(FileDataStoreFactory.class.getName());
    private static final boolean IS_WINDOWS = sc.u.OS_NAME.h().toLowerCase(Locale.ENGLISH).startsWith("windows");

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class FileDataStore<V extends Serializable> extends AbstractMemoryDataStore<V> {
        private final File dataFile;

        FileDataStore(FileDataStoreFactory fileDataStoreFactory, File file, String str) throws IOException {
            super(fileDataStoreFactory, str);
            File file2 = new File(file, str);
            this.dataFile = file2;
            if (IOUtils.isSymbolicLink(file2)) {
                throw new IOException("unable to use a symbolic link: " + file2);
            }
            if (!file2.createNewFile()) {
                this.keyValueMap = (HashMap) IOUtils.deserialize(new FileInputStream(file2));
            } else {
                this.keyValueMap = Maps.newHashMap();
                save();
            }
        }

        @Override // com.google.api.client.util.store.AbstractMemoryDataStore
        public void save() throws IOException {
            IOUtils.serialize(this.keyValueMap, new FileOutputStream(this.dataFile));
        }

        @Override // com.google.api.client.util.store.AbstractDataStore, com.google.api.client.util.store.DataStore
        public FileDataStoreFactory getDataStoreFactory() {
            return (FileDataStoreFactory) super.getDataStoreFactory();
        }
    }

    public FileDataStoreFactory(File file) throws IOException {
        File canonicalFile = file.getCanonicalFile();
        if (IOUtils.isSymbolicLink(canonicalFile)) {
            throw new IOException("unable to use a symbolic link: " + canonicalFile);
        }
        if (!canonicalFile.exists() && !canonicalFile.mkdirs()) {
            throw new IOException("unable to create directory: " + canonicalFile);
        }
        this.dataDirectory = canonicalFile;
        if (IS_WINDOWS) {
            setPermissionsToOwnerOnlyWindows(canonicalFile);
        } else {
            setPermissionsToOwnerOnly(canonicalFile);
        }
    }

    private static void setPermissionsToOwnerOnly(File file) throws IOException {
        HashSet hashSet = new HashSet();
        hashSet.add(PosixFilePermission.OWNER_READ);
        hashSet.add(PosixFilePermission.OWNER_WRITE);
        hashSet.add(PosixFilePermission.OWNER_EXECUTE);
        try {
            Files.setPosixFilePermissions(Paths.get(file.getAbsolutePath(), new String[0]), hashSet);
        } catch (RuntimeException e10) {
            throw new IOException("Unable to set permissions for " + file, e10);
        }
    }

    private static void setPermissionsToOwnerOnlyWindows(File file) throws IOException {
        Path path = Paths.get(file.getAbsolutePath(), new String[0]);
        try {
            f.a(Files.getFileAttributeView(path, e.a(), new LinkOption[0])).setAcl(c0.D(AclEntry.newBuilder().setType(AclEntryType.ALLOW).setPrincipal(d.a(Files.getFileAttributeView(path, o.a(), new LinkOption[0])).getOwner()).setPermissions(g0.E(AclEntryPermission.APPEND_DATA, AclEntryPermission.DELETE, AclEntryPermission.DELETE_CHILD, AclEntryPermission.READ_ACL, AclEntryPermission.READ_ATTRIBUTES, AclEntryPermission.READ_DATA, AclEntryPermission.READ_NAMED_ATTRS, AclEntryPermission.SYNCHRONIZE, AclEntryPermission.WRITE_ACL, AclEntryPermission.WRITE_ATTRIBUTES, AclEntryPermission.WRITE_DATA, AclEntryPermission.WRITE_NAMED_ATTRS, AclEntryPermission.WRITE_OWNER)).build()));
        } catch (SecurityException e10) {
            throw new IOException("Unable to set permissions for " + file, e10);
        }
    }

    @Override // com.google.api.client.util.store.AbstractDataStoreFactory
    protected <V extends Serializable> DataStore<V> createDataStore(String str) {
        return new FileDataStore(this, this.dataDirectory, str);
    }

    public final File getDataDirectory() {
        return this.dataDirectory;
    }
}

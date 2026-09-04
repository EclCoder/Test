package xn;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class b0 extends w {
    private final Long N0(FileTime fileTime) {
        Long lValueOf = Long.valueOf(fileTime.toMillis());
        if (lValueOf.longValue() != 0) {
            return lValueOf;
        }
        return null;
    }

    protected final k K0(Path nioPath) {
        kotlin.jvm.internal.s.h(nioPath, "nioPath");
        try {
            BasicFileAttributes attributes = Files.readAttributes(nioPath, (Class<BasicFileAttributes>) x.a(), LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(nioPath) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            h0 h0VarF = symbolicLink != null ? h0.a.f(h0.f56917b, symbolicLink, false, 1, null) : null;
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lN0 = fileTimeCreationTime != null ? N0(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lN1 = fileTimeLastModifiedTime != null ? N0(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new k(zIsRegularFile, zIsDirectory, h0VarF, lValueOf, lN0, lN1, fileTimeLastAccessTime != null ? N0(fileTimeLastAccessTime) : null, null, 128, null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // xn.w, xn.l
    public void d(h0 source, h0 target) throws IOException {
        kotlin.jvm.internal.s.h(source, "source");
        kotlin.jvm.internal.s.h(target, "target");
        try {
            Files.move(source.l(), target.l(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e10) {
            throw new FileNotFoundException(e10.getMessage());
        }
    }

    @Override // xn.w, xn.l
    public k t(h0 path) {
        kotlin.jvm.internal.s.h(path, "path");
        return K0(path.l());
    }

    @Override // xn.w
    public String toString() {
        return "NioSystemFileSystem";
    }
}

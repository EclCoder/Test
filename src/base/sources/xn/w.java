package xn;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import r7.pgx.XTkUEXuiK;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class w extends l {
    private final void F0(h0 h0Var) throws IOException {
        if (q(h0Var)) {
            return;
        }
        throw new IOException(h0Var + " doesn't exist.");
    }

    private final List m0(h0 h0Var, boolean z10) throws IOException {
        File file = h0Var.toFile();
        String[] list = file.list();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                kotlin.jvm.internal.s.e(str);
                arrayList.add(h0Var.i(str));
            }
            gl.r.x(arrayList);
            return arrayList;
        }
        if (!z10) {
            return null;
        }
        if (file.exists()) {
            throw new IOException("failed to list " + h0Var);
        }
        throw new FileNotFoundException("no such file: " + h0Var);
    }

    private final void p0(h0 h0Var) throws IOException {
        if (q(h0Var)) {
            throw new IOException(h0Var + " already exists.");
        }
    }

    @Override // xn.l
    public o0 c(h0 file, boolean z10) throws IOException {
        kotlin.jvm.internal.s.h(file, "file");
        if (z10) {
            F0(file);
        }
        return c0.d(file.toFile(), true);
    }

    @Override // xn.l
    public j c0(h0 file) {
        kotlin.jvm.internal.s.h(file, "file");
        return new v(false, new RandomAccessFile(file.toFile(), CampaignEx.JSON_KEY_AD_R));
    }

    @Override // xn.l
    public void d(h0 source, h0 target) throws IOException {
        kotlin.jvm.internal.s.h(source, "source");
        kotlin.jvm.internal.s.h(target, "target");
        if (source.toFile().renameTo(target.toFile())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    @Override // xn.l
    public o0 g0(h0 file, boolean z10) throws IOException {
        kotlin.jvm.internal.s.h(file, "file");
        if (z10) {
            p0(file);
        }
        return d0.c(file.toFile(), false, 1, null);
    }

    @Override // xn.l
    public void j(h0 dir, boolean z10) throws IOException {
        kotlin.jvm.internal.s.h(dir, "dir");
        if (dir.toFile().mkdir()) {
            return;
        }
        k kVarT = t(dir);
        if (kVarT == null || !kVarT.e()) {
            throw new IOException("failed to create directory: " + dir);
        }
        if (z10) {
            throw new IOException(dir + " already exists.");
        }
    }

    @Override // xn.l
    public void m(h0 path, boolean z10) throws IOException {
        kotlin.jvm.internal.s.h(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = path.toFile();
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            throw new IOException("failed to delete " + path);
        }
        if (z10) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    @Override // xn.l
    public List r(h0 dir) throws IOException {
        kotlin.jvm.internal.s.h(dir, "dir");
        List listM0 = m0(dir, true);
        kotlin.jvm.internal.s.e(listM0);
        return listM0;
    }

    @Override // xn.l
    public k t(h0 path) {
        kotlin.jvm.internal.s.h(path, "path");
        File file = path.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || file.exists()) {
            return new k(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null, null, 128, null);
        }
        return null;
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // xn.l
    public q0 i0(h0 h0Var) {
        kotlin.jvm.internal.s.h(h0Var, XTkUEXuiK.SdeEELSyCSkdlN);
        return c0.h(h0Var.toFile());
    }
}

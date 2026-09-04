package xn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class d0 {
    public static final o0 a(File file, boolean z10) {
        kotlin.jvm.internal.s.h(file, "<this>");
        return c0.e(new FileOutputStream(file, z10));
    }

    public static final o0 b(OutputStream outputStream) {
        kotlin.jvm.internal.s.h(outputStream, "<this>");
        return new g0(outputStream, new r0());
    }

    public static /* synthetic */ o0 c(File file, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return c0.d(file, z10);
    }

    public static final p0 d(Socket socket) {
        kotlin.jvm.internal.s.h(socket, "<this>");
        return new yn.h(socket);
    }

    public static final q0 e(File file) {
        kotlin.jvm.internal.s.h(file, "<this>");
        return new u(new FileInputStream(file), r0.f56980e);
    }

    public static final q0 f(InputStream inputStream) {
        kotlin.jvm.internal.s.h(inputStream, "<this>");
        return new u(inputStream, new r0());
    }
}

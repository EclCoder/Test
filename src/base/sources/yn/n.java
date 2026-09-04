package yn;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class n extends xn.c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Socket f58130p;

    public n(Socket socket) {
        kotlin.jvm.internal.s.h(socket, "socket");
        this.f58130p = socket;
    }

    @Override // xn.c
    protected IOException v(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // xn.c
    protected void z() {
        try {
            this.f58130p.close();
        } catch (AssertionError e10) {
            if (!u.b(e10)) {
                throw e10;
            }
            u.f58165a.log(Level.WARNING, "Failed to close timed out socket " + this.f58130p, (Throwable) e10);
        } catch (Exception e11) {
            u.f58165a.log(Level.WARNING, "Failed to close timed out socket " + this.f58130p, (Throwable) e11);
        }
    }
}

package n7;

import android.os.AsyncTask;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f46903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f46904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f46905c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a(File file);
    }

    public m(String uriStr, File destFile, a onSuccess) {
        s.h(uriStr, "uriStr");
        s.h(destFile, "destFile");
        s.h(onSuccess, "onSuccess");
        this.f46903a = uriStr;
        this.f46904b = destFile;
        this.f46905c = onSuccess;
    }

    public Boolean a(String... args) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            if (x7.a.c(this)) {
                return null;
            }
            try {
                s.h(args, "args");
                try {
                    URL url = new URL(this.f46903a);
                    int contentLength = url.openConnection().getContentLength();
                    DataInputStream dataInputStream = new DataInputStream(url.openStream());
                    byte[] bArr = new byte[contentLength];
                    dataInputStream.readFully(bArr);
                    dataInputStream.close();
                    DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.f46904b));
                    dataOutputStream.write(bArr);
                    dataOutputStream.flush();
                    dataOutputStream.close();
                    return Boolean.TRUE;
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            } catch (Throwable th2) {
                x7.a.b(th2, this);
                return null;
            }
        } catch (Throwable th3) {
            x7.a.b(th3, this);
            return null;
        }
    }

    protected void b(boolean z10) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            if (!x7.a.c(this) && z10) {
                try {
                    this.f46905c.a(this.f46904b);
                } catch (Throwable th2) {
                    x7.a.b(th2, this);
                }
            }
        } catch (Throwable th3) {
            x7.a.b(th3, this);
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            if (x7.a.c(this)) {
                return null;
            }
            try {
                return a((String[]) objArr);
            } catch (Throwable th2) {
                x7.a.b(th2, this);
                return null;
            }
        } catch (Throwable th3) {
            x7.a.b(th3, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            if (x7.a.c(this)) {
                return;
            }
            try {
                b(((Boolean) obj).booleanValue());
            } catch (Throwable th2) {
                x7.a.b(th2, this);
            }
        } catch (Throwable th3) {
            x7.a.b(th3, this);
        }
    }
}

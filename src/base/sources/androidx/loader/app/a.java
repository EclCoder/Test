package androidx.loader.app;

import android.os.Bundle;
import androidx.lifecycle.b0;
import androidx.lifecycle.u1;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: androidx.loader.app.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface InterfaceC0049a {
        androidx.loader.content.b onCreateLoader(int i10, Bundle bundle);

        void onLoadFinished(androidx.loader.content.b bVar, Object obj);

        void onLoaderReset(androidx.loader.content.b bVar);
    }

    public static a b(b0 b0Var) {
        return new b(b0Var, ((u1) b0Var).getViewModelStore());
    }

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract androidx.loader.content.b c(int i10, Bundle bundle, InterfaceC0049a interfaceC0049a);

    public abstract void d();
}

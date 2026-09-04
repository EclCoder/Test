package d4;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import fl.q;
import fl.w;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.s;
import y3.d1;
import y3.g0;
import y3.n;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements g0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f36177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f36178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference f36179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j.b f36180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ValueAnimator f36181e;

    public a(Context context, c configuration) {
        s.h(context, "context");
        s.h(configuration, "configuration");
        this.f36177a = context;
        this.f36178b = configuration;
        v0.c cVarB = configuration.b();
        this.f36179c = cVarB != null ? new WeakReference(cVarB) : null;
    }

    private final void b(boolean z10) {
        q qVarA;
        j.b bVar = this.f36180d;
        if (bVar == null || (qVarA = w.a(bVar, Boolean.TRUE)) == null) {
            j.b bVar2 = new j.b(this.f36177a);
            this.f36180d = bVar2;
            qVarA = w.a(bVar2, Boolean.FALSE);
        }
        j.b bVar3 = (j.b) qVarA.d();
        boolean zBooleanValue = ((Boolean) qVarA.g()).booleanValue();
        c(bVar3, z10 ? f.f36193b : f.f36192a);
        float f10 = z10 ? 0.0f : 1.0f;
        if (!zBooleanValue) {
            bVar3.setProgress(f10);
            return;
        }
        float fA = bVar3.a();
        ValueAnimator valueAnimator = this.f36181e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(bVar3, NotificationCompat.CATEGORY_PROGRESS, fA, f10);
        this.f36181e = objectAnimatorOfFloat;
        s.f(objectAnimatorOfFloat, "null cannot be cast to non-null type android.animation.ObjectAnimator");
        objectAnimatorOfFloat.start();
    }

    @Override // y3.g0.c
    public void a(g0 controller, d1 destination, Bundle bundle) {
        s.h(controller, "controller");
        s.h(destination, "destination");
        if (destination instanceof n) {
            return;
        }
        WeakReference weakReference = this.f36179c;
        v0.c cVar = weakReference != null ? (v0.c) weakReference.get() : null;
        if (this.f36179c != null && cVar == null) {
            controller.S(this);
            return;
        }
        String strH = destination.h(this.f36177a, bundle);
        if (strH != null) {
            d(strH);
        }
        boolean zC = this.f36178b.c(destination);
        boolean z10 = false;
        if (cVar == null && zC) {
            c(null, 0);
            return;
        }
        if (cVar != null && zC) {
            z10 = true;
        }
        b(z10);
    }

    protected abstract void c(Drawable drawable, int i10);

    protected abstract void d(CharSequence charSequence);
}

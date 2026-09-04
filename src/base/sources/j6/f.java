package j6;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class f extends j implements k6.b.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Animatable f42087h;

    public f(ImageView imageView) {
        super(imageView);
    }

    private void m(Object obj) {
        if (!(obj instanceof Animatable)) {
            this.f42087h = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f42087h = animatable;
        animatable.start();
    }

    private void p(Object obj) {
        o(obj);
        m(obj);
    }

    @Override // j6.i
    public void a(Object obj, k6.b bVar) {
        if (bVar == null || !bVar.a(obj, this)) {
            p(obj);
        } else {
            m(obj);
        }
    }

    @Override // j6.j, j6.a, j6.i
    public void c(Drawable drawable) {
        super.c(drawable);
        p(null);
        n(drawable);
    }

    @Override // j6.j, j6.a, j6.i
    public void e(Drawable drawable) {
        super.e(drawable);
        Animatable animatable = this.f42087h;
        if (animatable != null) {
            animatable.stop();
        }
        p(null);
        n(drawable);
    }

    @Override // j6.a, j6.i
    public void g(Drawable drawable) {
        super.g(drawable);
        p(null);
        n(drawable);
    }

    public void n(Drawable drawable) {
        ((ImageView) this.f42090a).setImageDrawable(drawable);
    }

    protected abstract void o(Object obj);

    @Override // f6.l
    public void onStart() {
        Animatable animatable = this.f42087h;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // f6.l
    public void onStop() {
        Animatable animatable = this.f42087h;
        if (animatable != null) {
            animatable.stop();
        }
    }
}

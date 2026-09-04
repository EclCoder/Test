package v6;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class e extends f implements SurfaceHolder.Callback, c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ArrayList f55196c = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference f55197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f55198b;

    public e(Context context) {
        super(context);
        b();
    }

    private void b() {
        a aVar = new a(this);
        this.f55198b = aVar;
        f55196c.add(aVar);
    }

    @Override // v6.c
    public void a(d dVar) {
        this.f55197a = new WeakReference(dVar);
        SurfaceHolder holder = getHolder();
        holder.setFormat(-3);
        Iterator it = f55196c.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null && aVar.a() == null) {
                holder.removeCallback(aVar);
                it.remove();
            }
        }
        holder.addCallback(this.f55198b);
    }

    @Override // v6.c
    public void hnj(int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i11;
        layoutParams.width = i10;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        WeakReference weakReference = this.f55197a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((d) this.f55197a.get()).hnj(surfaceHolder, i10, i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        WeakReference weakReference = this.f55197a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((d) this.f55197a.get()).hnj(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        WeakReference weakReference = this.f55197a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((d) this.f55197a.get()).hn(surfaceHolder);
    }

    @Override // v6.c
    public View getView() {
        return this;
    }

    public void setWindowVisibilityChangedListener(c.a aVar) {
    }
}

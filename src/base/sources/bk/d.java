package bk;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class d extends h {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Drawable f9008k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Rect f9009l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f9010m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f9011n;

    public d(Drawable drawable) {
        this.f9008k = drawable;
        this.f9009l = new Rect(0, 0, p(), i());
    }

    @Override // bk.h
    public void e(Canvas canvas) {
        canvas.save();
        canvas.concat(m());
        this.f9008k.setBounds(this.f9009l);
        this.f9008k.draw(canvas);
        canvas.restore();
    }

    @Override // bk.h
    public int i() {
        int i10 = this.f9011n;
        return i10 == 0 ? this.f9008k.getIntrinsicHeight() : i10;
    }

    @Override // bk.h
    public int p() {
        int i10 = this.f9010m;
        return i10 == 0 ? this.f9008k.getIntrinsicWidth() : i10;
    }

    public d(Drawable drawable, int i10, int i11) {
        this.f9008k = drawable;
        this.f9009l = new Rect(0, 0, i10, i11);
        this.f9010m = i10;
        this.f9011n = i11;
    }
}

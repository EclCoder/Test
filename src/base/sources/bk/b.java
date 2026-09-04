package bk;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.xiaopo.flying.sticker.StickerView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b extends d implements i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f9002o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f9003p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f9004q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f9005r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f9006s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private i f9007t;

    public b(Drawable drawable, int i10) {
        super(drawable);
        this.f9002o = 30.0f;
        this.f9003p = 10.0f;
        this.f9006s = i10;
    }

    public float A() {
        return this.f9005r;
    }

    public void B(i iVar) {
        this.f9007t = iVar;
    }

    public void C(float f10) {
        this.f9002o = f10;
    }

    public void D(float f10) {
        this.f9004q = f10;
    }

    public void E(float f10) {
        this.f9005r = f10;
    }

    @Override // bk.i
    public void a(StickerView stickerView, MotionEvent motionEvent) {
        i iVar = this.f9007t;
        if (iVar != null) {
            iVar.a(stickerView, motionEvent);
        }
    }

    @Override // bk.i
    public void b(StickerView stickerView, MotionEvent motionEvent) {
        i iVar = this.f9007t;
        if (iVar != null) {
            iVar.b(stickerView, motionEvent);
        }
    }

    @Override // bk.i
    public void c(StickerView stickerView, MotionEvent motionEvent) {
        i iVar = this.f9007t;
        if (iVar != null) {
            iVar.c(stickerView, motionEvent);
        }
    }

    public void w(Canvas canvas, Paint paint) {
        canvas.drawCircle(this.f9004q, this.f9005r, this.f9002o, paint);
        super.e(canvas);
    }

    public float x() {
        return this.f9002o;
    }

    public int y() {
        return this.f9006s;
    }

    public float z() {
        return this.f9004q;
    }
}

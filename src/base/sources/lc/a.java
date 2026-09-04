package lc;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f44292i = new int[3];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float[] f44293j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f44294k = new int[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float[] f44295l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f44296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f44297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f44298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f44299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f44300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f44301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Path f44302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f44303h;

    public a() {
        this(-16777216);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i10, float f10, float f11) {
        float f12;
        boolean z10 = f11 < 0.0f;
        Path path = this.f44302g;
        if (z10) {
            int[] iArr = f44294k;
            iArr[0] = 0;
            iArr[1] = this.f44301f;
            iArr[2] = this.f44300e;
            iArr[3] = this.f44299d;
            f12 = f10;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            f12 = f10;
            path.arcTo(rectF, f12, f11);
            path.close();
            float f13 = -i10;
            rectF.inset(f13, f13);
            int[] iArr2 = f44294k;
            iArr2[0] = 0;
            iArr2[1] = this.f44299d;
            iArr2[2] = this.f44300e;
            iArr2[3] = this.f44301f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f14 = 1.0f - (i10 / fWidth);
        float[] fArr = f44295l;
        fArr[1] = f14;
        fArr[2] = ((1.0f - f14) / 2.0f) + f14;
        this.f44297b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f44294k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z10) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f44303h);
        }
        canvas.drawArc(rectF, f12, f11, true, this.f44297b);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i10) {
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = f44292i;
        iArr[0] = this.f44301f;
        iArr[1] = this.f44300e;
        iArr[2] = this.f44299d;
        Paint paint = this.f44298c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, f44293j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f44298c);
        canvas.restore();
    }

    public Paint c() {
        return this.f44296a;
    }

    public void d(int i10) {
        this.f44299d = e0.a.k(i10, 68);
        this.f44300e = e0.a.k(i10, 20);
        this.f44301f = e0.a.k(i10, 0);
        this.f44296a.setColor(this.f44299d);
    }

    public a(int i10) {
        this.f44302g = new Path();
        Paint paint = new Paint();
        this.f44303h = paint;
        this.f44296a = new Paint();
        d(i10);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f44297b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f44298c = new Paint(paint2);
    }
}

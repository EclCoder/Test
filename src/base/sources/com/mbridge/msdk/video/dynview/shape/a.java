package com.mbridge.msdk.video.dynview.shape;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a extends ShapeDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f34277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f34278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f34279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f34280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f34281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Bitmap f34282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Bitmap f34283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f34284h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Paint f34285i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Matrix f34286j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private RectShape f34287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Bitmap f34288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bitmap f34289c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f34290d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f34291e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f34292f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f34293g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f34294h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float f34295i;

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public a build() {
            return new a(this);
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c orientation(int i10) {
            this.f34291e = i10;
            return this;
        }

        private b() {
            this.f34292f = 100;
            this.f34293g = 10;
            this.f34287a = new RectShape();
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c a(Bitmap bitmap) {
            this.f34289c = bitmap;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c b(Bitmap bitmap) {
            this.f34288b = bitmap;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c a(boolean z10) {
            this.f34290d = z10;
            return this;
        }

        public c b(float f10) {
            this.f34294h = f10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c a(float f10) {
            this.f34295i = f10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c a(int i10) {
            this.f34293g = i10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
        c a(float f10);

        c a(int i10);

        c a(Bitmap bitmap);

        c a(boolean z10);

        c b(Bitmap bitmap);

        a build();

        c orientation(int i10);
    }

    private void a(Canvas canvas) {
        float f10 = this.f34278b / 2.0f;
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(0.0f, this.f34279c);
        path.lineTo((f10 - this.f34280d) - this.f34281e, this.f34279c);
        path.lineTo((this.f34280d + f10) - this.f34281e, 0.0f);
        if (this.f34284h) {
            try {
                a(canvas, path);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            Bitmap bitmap = this.f34282f;
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    a(canvas, path, this.f34282f);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
        Path path2 = new Path();
        path2.moveTo(this.f34280d + f10 + this.f34281e, 0.0f);
        path2.lineTo(this.f34278b, 0.0f);
        path2.lineTo(this.f34278b, this.f34279c);
        path2.lineTo((f10 - this.f34280d) + this.f34281e, this.f34279c);
        if (this.f34284h) {
            try {
                a(canvas, path2);
                return;
            } catch (Exception e12) {
                e12.printStackTrace();
                return;
            }
        }
        Bitmap bitmap2 = this.f34283g;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        try {
            a(canvas, path2, this.f34283g);
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    private void b(Canvas canvas) {
        float f10 = this.f34279c / 2.0f;
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(0.0f, (this.f34280d + f10) - this.f34281e);
        path.lineTo(this.f34278b, (f10 - this.f34280d) - this.f34281e);
        path.lineTo(this.f34278b, 0.0f);
        if (this.f34284h) {
            try {
                a(canvas, path);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            Bitmap bitmap = this.f34282f;
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    a(canvas, path, this.f34282f);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
        Path path2 = new Path();
        path2.moveTo(0.0f, this.f34280d + f10 + this.f34281e);
        path2.lineTo(0.0f, this.f34279c);
        path2.lineTo(this.f34278b, this.f34279c);
        path2.lineTo(this.f34278b, (f10 - this.f34280d) + this.f34281e);
        if (this.f34284h) {
            try {
                a(canvas, path2);
                return;
            } catch (Exception e12) {
                e12.printStackTrace();
                return;
            }
        }
        Bitmap bitmap2 = this.f34283g;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        try {
            a(canvas, path2, this.f34283g);
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f34277a == 1) {
            b(canvas);
        } else {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    private a(b bVar) {
        super(bVar.f34287a);
        this.f34284h = false;
        this.f34282f = bVar.f34288b;
        this.f34283g = bVar.f34289c;
        this.f34284h = bVar.f34290d;
        this.f34277a = bVar.f34291e;
        this.f34280d = bVar.f34292f;
        this.f34281e = bVar.f34293g;
        this.f34278b = bVar.f34294h;
        this.f34279c = bVar.f34295i;
        Paint paint = new Paint();
        this.f34285i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f34285i.setAntiAlias(true);
        this.f34286j = new Matrix();
    }

    private void a(Canvas canvas, Path path, Bitmap bitmap) {
        if (canvas == null || path == null || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0) {
            float fMax = Math.max(this.f34278b / bitmap.getWidth(), this.f34279c / bitmap.getHeight());
            if (this.f34286j == null) {
                this.f34286j = new Matrix();
            }
            this.f34286j.reset();
            this.f34286j.preScale(fMax, fMax);
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(this.f34286j);
        this.f34285i.setShader(bitmapShader);
        canvas.drawPath(path, this.f34285i);
    }

    private void a(Canvas canvas, Path path) {
        this.f34285i.setColor(Color.parseColor("#40EAEAEA"));
        canvas.drawPath(path, this.f34285i);
    }

    public static b a() {
        return new b();
    }
}

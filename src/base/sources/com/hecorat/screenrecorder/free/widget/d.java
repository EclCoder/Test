package com.hecorat.screenrecorder.free.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.hecorat.screenrecorder.free.R;
import nh.l0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class d extends AppCompatImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f23766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f23767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f23768f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f23769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f23770h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f23771i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f23772j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f23773k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private RectF f23774l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private RectF f23775m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private RectF f23776n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private RectF f23777o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private RectF f23778p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private RectF f23779q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Bitmap f23780r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Context f23781s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Paint f23782t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private b f23783u;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void g(boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class c implements View.OnTouchListener {
        private c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    d.this.f23771i = 0;
                    d.this.f23773k = false;
                    d.this.invalidate();
                } else if (action == 2 && d.this.f23773k) {
                    int i10 = d.this.f23771i;
                    if (i10 == 1) {
                        d.this.f23763a = y10;
                        if (d.this.f23763a > d.this.f23765c - d.this.f23770h) {
                            d dVar = d.this;
                            dVar.f23763a = dVar.f23765c - d.this.f23770h;
                        }
                        if (d.this.f23763a < 0) {
                            d.this.f23763a = 0;
                        }
                        d.this.o();
                    } else if (i10 == 2) {
                        d.this.f23765c = y10;
                        if (d.this.f23765c < d.this.f23763a + d.this.f23770h) {
                            d dVar2 = d.this;
                            dVar2.f23765c = dVar2.f23763a + d.this.f23770h;
                        }
                        if (d.this.f23765c > d.this.f23768f) {
                            d dVar3 = d.this;
                            dVar3.f23765c = dVar3.f23768f;
                        }
                        d.this.o();
                    }
                }
            } else if (y10 > d.this.f23763a - 60 && y10 < d.this.f23763a + 63) {
                d.this.f23771i = 1;
                d.this.f23783u.g(true);
                d.this.f23773k = true;
            } else if (y10 <= d.this.f23765c - 63 || y10 >= d.this.f23765c + 60) {
                d.this.f23783u.g(false);
                d.this.f23773k = false;
            } else {
                d.this.f23771i = 2;
                d.this.f23773k = true;
                d.this.f23783u.g(true);
            }
            return true;
        }
    }

    public d(Context context, int i10, int i11, int i12, float f10) {
        super(context);
        this.f23769g = 0;
        this.f23771i = 0;
        this.f23773k = false;
        this.f23782t = new Paint();
        this.f23781s = context;
        int iG = nh.b.g(context);
        this.f23766d = iG;
        this.f23767e = (iG / 2) - (i10 / 2);
        this.f23768f = i11;
        this.f23764b = i10;
        this.f23763a = i12;
        this.f23765c = i11;
        this.f23770h = nh.b.a(context, 50);
        this.f23772j = f10;
        this.f23780r = l0.b(androidx.core.content.a.getDrawable(context, R.drawable.ic_content_cut_white_24dp));
        o();
        setOnTouchListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        int i10 = this.f23767e;
        this.f23774l = new RectF(i10, 0.0f, i10 + this.f23764b, this.f23763a);
        int i11 = this.f23767e;
        int i12 = this.f23763a;
        this.f23776n = new RectF(i11, i12, i11 + this.f23764b, i12 + 3);
        int i13 = this.f23767e;
        this.f23775m = new RectF(i13, this.f23765c, i13 + this.f23764b, this.f23768f);
        int i14 = this.f23767e;
        int i15 = this.f23765c;
        this.f23777o = new RectF(i14, i15 - 3, i14 + this.f23764b, i15);
        int i16 = this.f23766d / 2;
        int iA = nh.b.a(this.f23781s, 15);
        int iA2 = nh.b.a(this.f23781s, 9);
        float f10 = i16 - iA;
        int i17 = this.f23763a;
        float f11 = i16 + iA;
        this.f23778p = new RectF(f10, i17 + 3, f11, i17 + 3 + iA2);
        int i18 = this.f23765c;
        this.f23779q = new RectF(f10, (i18 - 3) - iA2, f11, i18 - 3);
        invalidate();
        wp.a.a("Stitch bottom = %s", Integer.valueOf(this.f23765c));
    }

    public int getBottomValue() {
        return (int) (this.f23772j * this.f23765c);
    }

    public int getTopValue() {
        return (int) (this.f23772j * this.f23763a);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f23782t.setColor(androidx.core.content.a.getColor(this.f23781s, R.color.black_opacity));
        canvas.drawRect(this.f23774l, this.f23782t);
        canvas.drawRect(this.f23775m, this.f23782t);
        this.f23782t.setColor(androidx.core.content.a.getColor(this.f23781s, R.color.sunset_orange));
        canvas.drawRect(this.f23776n, this.f23782t);
        canvas.drawRect(this.f23777o, this.f23782t);
        canvas.drawRect(this.f23778p, this.f23782t);
        canvas.drawRect(this.f23779q, this.f23782t);
        int i10 = this.f23766d / 2;
        int iA = nh.b.a(this.f23781s, 3);
        int iA2 = nh.b.a(this.f23781s, 5);
        this.f23782t.setColor(-1);
        float f10 = i10 - iA2;
        int i11 = this.f23763a;
        float f11 = i10 + iA2;
        canvas.drawLine(f10, i11 + 3 + iA, f11, i11 + 3 + iA, this.f23782t);
        int i12 = this.f23763a;
        int i13 = iA * 2;
        canvas.drawLine(f10, i12 + 3 + i13, f11, i12 + 3 + i13, this.f23782t);
        int i14 = this.f23765c;
        canvas.drawLine(f10, (i14 - 3) - iA, f11, (i14 - 3) - iA, this.f23782t);
        int i15 = this.f23765c;
        canvas.drawLine(f10, (i15 - 3) - i13, f11, (i15 - 3) - i13, this.f23782t);
        float width = this.f23767e - this.f23780r.getWidth();
        canvas.drawBitmap(this.f23780r, width, this.f23763a - (this.f23780r.getHeight() / 2), this.f23782t);
        canvas.drawBitmap(this.f23780r, width, this.f23765c - (this.f23780r.getHeight() / 2), this.f23782t);
    }

    public void setScrollParentStateChange(b bVar) {
        this.f23783u = bVar;
    }
}

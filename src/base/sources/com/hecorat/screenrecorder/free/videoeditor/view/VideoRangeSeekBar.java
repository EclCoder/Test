package com.hecorat.screenrecorder.free.videoeditor.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.hecorat.screenrecorder.free.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class VideoRangeSeekBar extends View {
    private int A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f23521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f23522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23523g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList f23524h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private RectF f23525i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private RectF f23526j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private RectF[] f23527k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Paint f23528l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Path f23529m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f23530n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f23531o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f23532p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f23533q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f23534r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f23535s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f23536t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f23537u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    float f23538v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private double f23539w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f23540x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private b f23541y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f23542z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a(long j10, long j11);

        void b(long j10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class c implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f23544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f23545c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f23546d;

        private c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            this.f23543a = (int) motionEvent.getX();
            this.f23544b = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                wp.a.a("MotionEvent ACTION_DOWN %s", Integer.valueOf(this.f23543a));
                this.f23545c = this.f23543a;
                this.f23546d = this.f23544b;
                if (VideoRangeSeekBar.this.f23540x) {
                    if (this.f23545c > (VideoRangeSeekBar.this.f23517a - VideoRangeSeekBar.this.f23521e) - VideoRangeSeekBar.this.f23537u && this.f23545c < VideoRangeSeekBar.this.f23517a + VideoRangeSeekBar.this.f23537u) {
                        VideoRangeSeekBar videoRangeSeekBar = VideoRangeSeekBar.this;
                        videoRangeSeekBar.f23523g = this.f23545c <= videoRangeSeekBar.f23522f ? 1 : 2;
                    } else if (this.f23545c > VideoRangeSeekBar.this.f23518b - VideoRangeSeekBar.this.f23537u && this.f23545c < VideoRangeSeekBar.this.f23518b + VideoRangeSeekBar.this.f23521e + VideoRangeSeekBar.this.f23537u) {
                        VideoRangeSeekBar videoRangeSeekBar2 = VideoRangeSeekBar.this;
                        videoRangeSeekBar2.f23523g = this.f23545c < videoRangeSeekBar2.f23522f ? 1 : 2;
                    } else if (this.f23545c > VideoRangeSeekBar.this.f23517a + VideoRangeSeekBar.this.f23537u && this.f23545c < VideoRangeSeekBar.this.f23518b - VideoRangeSeekBar.this.f23537u) {
                        VideoRangeSeekBar.this.f23523g = 3;
                    }
                } else if (this.f23545c > VideoRangeSeekBar.this.f23517a - VideoRangeSeekBar.this.f23537u && this.f23545c < VideoRangeSeekBar.this.f23517a + VideoRangeSeekBar.this.f23521e + VideoRangeSeekBar.this.f23537u) {
                    VideoRangeSeekBar videoRangeSeekBar3 = VideoRangeSeekBar.this;
                    videoRangeSeekBar3.f23523g = this.f23545c <= videoRangeSeekBar3.f23522f ? 1 : 2;
                } else if (this.f23545c > (VideoRangeSeekBar.this.f23518b - VideoRangeSeekBar.this.f23521e) - VideoRangeSeekBar.this.f23537u && this.f23545c < VideoRangeSeekBar.this.f23518b + VideoRangeSeekBar.this.f23537u) {
                    VideoRangeSeekBar videoRangeSeekBar4 = VideoRangeSeekBar.this;
                    videoRangeSeekBar4.f23523g = this.f23545c < videoRangeSeekBar4.f23522f ? 1 : 2;
                } else if ((this.f23545c < VideoRangeSeekBar.this.f23517a - VideoRangeSeekBar.this.f23537u && this.f23545c > VideoRangeSeekBar.this.f23519c) || (this.f23545c > VideoRangeSeekBar.this.f23518b + VideoRangeSeekBar.this.f23537u && this.f23545c < VideoRangeSeekBar.this.f23520d)) {
                    VideoRangeSeekBar.this.f23523g = 3;
                }
            } else if (action == 1) {
                VideoRangeSeekBar.this.f23523g = 0;
                VideoRangeSeekBar.this.invalidate();
            } else if (action == 2) {
                wp.a.a("MotionEvent ACTION_MOVE %s", Integer.valueOf(this.f23543a));
                int i10 = VideoRangeSeekBar.this.f23523g;
                if (i10 == 1) {
                    VideoRangeSeekBar.this.f23517a = this.f23543a;
                    if (VideoRangeSeekBar.this.f23517a < VideoRangeSeekBar.this.f23519c) {
                        VideoRangeSeekBar videoRangeSeekBar5 = VideoRangeSeekBar.this;
                        videoRangeSeekBar5.f23517a = videoRangeSeekBar5.f23519c;
                    }
                    if (VideoRangeSeekBar.this.f23517a > VideoRangeSeekBar.this.f23518b) {
                        VideoRangeSeekBar videoRangeSeekBar6 = VideoRangeSeekBar.this;
                        videoRangeSeekBar6.f23517a = videoRangeSeekBar6.f23518b;
                    }
                    VideoRangeSeekBar videoRangeSeekBar7 = VideoRangeSeekBar.this;
                    videoRangeSeekBar7.f23535s = videoRangeSeekBar7.f23517a;
                    VideoRangeSeekBar.this.x();
                    VideoRangeSeekBar.this.z();
                } else if (i10 == 2) {
                    VideoRangeSeekBar.this.f23518b = this.f23543a;
                    if (VideoRangeSeekBar.this.f23518b > VideoRangeSeekBar.this.f23520d) {
                        VideoRangeSeekBar videoRangeSeekBar8 = VideoRangeSeekBar.this;
                        videoRangeSeekBar8.f23518b = videoRangeSeekBar8.f23520d;
                    }
                    if (VideoRangeSeekBar.this.f23518b < VideoRangeSeekBar.this.f23517a) {
                        VideoRangeSeekBar videoRangeSeekBar9 = VideoRangeSeekBar.this;
                        videoRangeSeekBar9.f23518b = videoRangeSeekBar9.f23517a;
                    }
                    VideoRangeSeekBar videoRangeSeekBar10 = VideoRangeSeekBar.this;
                    videoRangeSeekBar10.f23535s = videoRangeSeekBar10.f23518b;
                    VideoRangeSeekBar.this.x();
                    VideoRangeSeekBar.this.z();
                } else if (i10 == 3) {
                    VideoRangeSeekBar.this.f23535s = this.f23543a;
                    VideoRangeSeekBar.this.r();
                    VideoRangeSeekBar.this.v();
                    VideoRangeSeekBar.this.invalidate();
                }
                this.f23545c = this.f23543a;
                this.f23546d = this.f23544b;
            }
            return true;
        }
    }

    public VideoRangeSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23521e = getResources().getDimensionPixelSize(R.dimen.trim_bound_width);
        this.f23523g = 0;
        this.f23524h = new ArrayList();
        this.f23528l = new Paint();
        this.f23530n = getResources().getColor(R.color.sunset_orange);
        this.f23531o = getResources().getColor(R.color.red_orange);
        this.f23532p = getResources().getColor(R.color.tundora_opacity);
        this.f23533q = getResources().getColor(R.color.white);
        this.f23534r = getResources().getDimensionPixelSize(R.dimen.scrubber_width);
        this.f23536t = getResources().getDimensionPixelSize(R.dimen.trim_arrow_margin);
        this.f23537u = getResources().getDimensionPixelSize(R.dimen.bound_padding_x);
        this.f23538v = getResources().getDimensionPixelSize(R.dimen.bound_stroke_width);
        this.f23540x = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        int i10;
        if (this.f23540x) {
            int i11 = this.f23535s;
            int i12 = this.f23517a;
            if (i11 < i12) {
                this.f23535s = i12;
            }
            int i13 = this.f23535s;
            int i14 = this.f23518b;
            if (i13 > i14) {
                this.f23535s = i14;
                return;
            }
            return;
        }
        int i15 = this.f23535s;
        if (i15 > this.f23517a && i15 < (i10 = this.f23518b)) {
            this.f23535s = i10;
        }
        int i16 = this.f23535s;
        int i17 = this.f23519c;
        if (i16 < i17) {
            this.f23535s = i17;
        }
        int i18 = this.f23535s;
        int i19 = this.f23520d;
        if (i18 > i19) {
            this.f23535s = i19;
        }
    }

    private long s(int i10) {
        return Math.round(((double) (i10 - this.f23519c)) / this.f23539w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        this.f23541y.b(s(this.f23535s));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        int i10 = this.f23542z + this.A;
        this.f23522f = (this.f23517a + this.f23518b) / 2;
        this.f23529m = new Path();
        if (this.f23540x) {
            int i11 = this.f23517a;
            float f10 = i11 - this.f23521e;
            float f11 = this.f23542z;
            float f12 = this.f23538v;
            this.f23525i = new RectF(f10, f11 - (f12 / 2.0f), i11, this.A + (f12 / 2.0f));
            int i12 = this.f23518b;
            float f13 = this.f23542z;
            float f14 = this.f23538v;
            this.f23526j = new RectF(i12, f13 - (f14 / 2.0f), i12 + this.f23521e, this.A + (f14 / 2.0f));
            RectF[] rectFArr = new RectF[2];
            this.f23527k = rectFArr;
            rectFArr[0] = new RectF(this.f23519c, this.f23542z, this.f23517a, this.A);
            this.f23527k[1] = new RectF(this.f23518b, this.f23542z, this.f23520d, this.A);
            float f15 = i10;
            float f16 = f15 / 4.0f;
            this.f23529m.moveTo(this.f23517a - this.f23536t, f16);
            float f17 = f15 / 2.0f;
            this.f23529m.lineTo((this.f23517a - this.f23521e) + this.f23536t, f17);
            float f18 = (i10 * 3) / 4.0f;
            this.f23529m.lineTo(this.f23517a - this.f23536t, f18);
            this.f23529m.moveTo(this.f23518b + this.f23536t, f16);
            this.f23529m.lineTo((this.f23518b + this.f23521e) - this.f23536t, f17);
            this.f23529m.lineTo(this.f23518b + this.f23536t, f18);
        } else {
            int i13 = this.f23517a;
            float f19 = this.f23542z;
            float f20 = this.f23538v;
            this.f23525i = new RectF(i13, f19 - (f20 / 2.0f), i13 + this.f23521e, this.A + (f20 / 2.0f));
            int i14 = this.f23518b;
            float f21 = i14 - this.f23521e;
            float f22 = this.f23542z;
            float f23 = this.f23538v;
            this.f23526j = new RectF(f21, f22 - (f23 / 2.0f), i14, this.A + (f23 / 2.0f));
            this.f23527k = new RectF[]{new RectF(this.f23517a, this.f23542z, this.f23518b, this.A)};
            float f24 = i10;
            float f25 = f24 / 4.0f;
            this.f23529m.moveTo((this.f23517a + this.f23521e) - this.f23536t, f25);
            float f26 = f24 / 2.0f;
            this.f23529m.lineTo(this.f23517a + this.f23536t, f26);
            float f27 = (i10 * 3) / 4.0f;
            this.f23529m.lineTo((this.f23517a + this.f23521e) - this.f23536t, f27);
            this.f23529m.moveTo((this.f23518b - this.f23521e) + this.f23536t, f25);
            this.f23529m.lineTo(this.f23518b - this.f23536t, f26);
            this.f23529m.lineTo((this.f23518b - this.f23521e) + this.f23536t, f27);
        }
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        this.f23541y.a(s(this.f23517a), s(this.f23518b));
        v();
    }

    public long getLeftBoundTime() {
        return s(this.f23517a);
    }

    public long getRightBoundTime() {
        return s(this.f23518b);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f23528l.setColor(-1);
        int size = this.f23524h.size();
        if (size == 0) {
            return;
        }
        int width = ((Bitmap) this.f23524h.get(0)).getWidth();
        for (int i10 = 0; i10 < size; i10++) {
            canvas.drawBitmap((Bitmap) this.f23524h.get(i10), this.f23519c + (i10 * width), this.f23542z, this.f23528l);
        }
        this.f23528l.setColor(this.f23532p);
        for (RectF rectF : this.f23527k) {
            canvas.drawRect(rectF, this.f23528l);
        }
        this.f23528l.setColor(this.f23530n);
        this.f23528l.setStrokeWidth(this.f23538v);
        if (this.f23540x) {
            float f10 = this.f23517a;
            int i11 = this.f23521e;
            int i12 = this.f23542z;
            canvas.drawLine(f10 - (i11 / 2.0f), i12, this.f23518b + (i11 / 2.0f), i12, this.f23528l);
            float f11 = this.f23517a;
            int i13 = this.f23521e;
            int i14 = this.A;
            canvas.drawLine(f11 - (i13 / 2.0f), i14, this.f23518b + (i13 / 2.0f), i14, this.f23528l);
        } else {
            int i15 = this.f23519c;
            canvas.drawLine(i15, this.f23542z, i15, this.A, this.f23528l);
            float f12 = this.f23519c;
            int i16 = this.f23542z;
            canvas.drawLine(f12, i16, this.f23517a, i16, this.f23528l);
            float f13 = this.f23519c;
            int i17 = this.A;
            canvas.drawLine(f13, i17, this.f23517a, i17, this.f23528l);
            int i18 = this.f23520d;
            canvas.drawLine(i18, this.f23542z, i18, this.A, this.f23528l);
            float f14 = this.f23518b;
            int i19 = this.f23542z;
            canvas.drawLine(f14, i19, this.f23520d, i19, this.f23528l);
            float f15 = this.f23518b;
            int i20 = this.A;
            canvas.drawLine(f15, i20, this.f23520d, i20, this.f23528l);
        }
        this.f23528l.setStrokeWidth(this.f23538v);
        this.f23528l.setColor(this.f23523g == 1 ? this.f23531o : this.f23530n);
        float f16 = 4;
        canvas.drawRoundRect(this.f23525i, f16, f16, this.f23528l);
        this.f23528l.setColor(this.f23523g == 2 ? this.f23531o : this.f23530n);
        canvas.drawRoundRect(this.f23526j, f16, f16, this.f23528l);
        this.f23528l.setColor(this.f23533q);
        canvas.drawPath(this.f23529m, this.f23528l);
        this.f23528l.setColor(-1);
        this.f23528l.setStrokeWidth(this.f23534r);
        int i21 = this.f23535s;
        canvas.drawLine(i21, 0.0f, i21, this.A + this.f23542z, this.f23528l);
    }

    public void setMode(boolean z10) {
        this.f23540x = z10;
        x();
    }

    public void t(long j10, long j11) {
        this.f23517a = (int) (Math.round(j10 * this.f23539w) + ((long) this.f23519c));
        this.f23518b = (int) (Math.round(j11 * this.f23539w) + ((long) this.f23519c));
        x();
    }

    public void u(long j10, int i10, int i11, int i12, int i13, b bVar) {
        this.f23519c = i10;
        this.f23520d = i11;
        this.f23542z = i12;
        this.A = i13;
        this.f23539w = ((double) (i11 - i10)) / j10;
        this.f23517a = i10;
        this.f23518b = i11;
        this.f23535s = i10;
        setOnTouchListener(new c());
        this.f23541y = bVar;
        x();
    }

    public void w(long j10) {
        this.f23535s = (int) (((double) this.f23519c) + (j10 * this.f23539w));
        r();
        wp.a.a("updateScrubber. Pos: %s, scrubberX: %s", Long.valueOf(j10), Integer.valueOf(this.f23535s));
        invalidate();
    }

    public void y(ArrayList arrayList) {
        this.f23524h = arrayList;
        invalidate();
    }
}

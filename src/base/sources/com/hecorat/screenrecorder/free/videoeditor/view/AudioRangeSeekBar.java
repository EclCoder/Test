package com.hecorat.screenrecorder.free.videoeditor.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.hecorat.screenrecorder.free.R;
import com.mbridge.msdk.dycreator.binding.vREM.mTFeqtajA;
import nh.l0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class AudioRangeSeekBar extends View {
    private int A;
    private String B;
    private String C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f23458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f23459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Path f23461h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Path f23462i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Paint f23463j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f23464k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f23465l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f23466m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f23467n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f23468o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f23469p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f23470q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f23471r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f23472s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f23473t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f23474u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    float f23475v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private double f23476w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private b f23477x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f23478y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f23479z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public interface b {
        void a(long j10, long j11);

        void b(long j10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    private final class c implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f23481b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f23482c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f23483d;

        private c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            this.f23480a = (int) motionEvent.getX();
            this.f23481b = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                wp.a.a("MotionEvent ACTION_DOWN %s", Integer.valueOf(this.f23480a));
                int i10 = this.f23480a;
                this.f23482c = i10;
                this.f23483d = this.f23481b;
                if (i10 > (AudioRangeSeekBar.this.f23454a - (AudioRangeSeekBar.this.f23458e / 2.0f)) - AudioRangeSeekBar.this.f23470q && this.f23482c < AudioRangeSeekBar.this.f23454a + (AudioRangeSeekBar.this.f23458e / 2.0f) + AudioRangeSeekBar.this.f23470q) {
                    AudioRangeSeekBar audioRangeSeekBar = AudioRangeSeekBar.this;
                    audioRangeSeekBar.f23460g = this.f23482c <= audioRangeSeekBar.f23459f ? 1 : 2;
                } else if (this.f23482c > (AudioRangeSeekBar.this.f23455b - (AudioRangeSeekBar.this.f23458e / 2.0f)) - AudioRangeSeekBar.this.f23470q && this.f23482c < AudioRangeSeekBar.this.f23455b + (AudioRangeSeekBar.this.f23458e / 2.0f) + AudioRangeSeekBar.this.f23470q) {
                    AudioRangeSeekBar audioRangeSeekBar2 = AudioRangeSeekBar.this;
                    audioRangeSeekBar2.f23460g = this.f23482c < audioRangeSeekBar2.f23459f ? 1 : 2;
                } else if (this.f23482c > AudioRangeSeekBar.this.f23454a + (AudioRangeSeekBar.this.f23458e / 2.0f) + AudioRangeSeekBar.this.f23470q && this.f23482c < (AudioRangeSeekBar.this.f23455b - (AudioRangeSeekBar.this.f23458e / 2.0f)) - AudioRangeSeekBar.this.f23470q) {
                    AudioRangeSeekBar.this.f23460g = 3;
                }
            } else if (action == 1) {
                AudioRangeSeekBar.this.f23460g = 0;
                AudioRangeSeekBar.this.invalidate();
            } else if (action == 2) {
                wp.a.a("MotionEvent ACTION_MOVE %s", Integer.valueOf(this.f23480a));
                int i11 = AudioRangeSeekBar.this.f23460g;
                if (i11 == 1) {
                    AudioRangeSeekBar.this.f23454a = this.f23480a;
                    if (AudioRangeSeekBar.this.f23454a < AudioRangeSeekBar.this.f23456c) {
                        AudioRangeSeekBar audioRangeSeekBar3 = AudioRangeSeekBar.this;
                        audioRangeSeekBar3.f23454a = audioRangeSeekBar3.f23456c;
                    }
                    if (AudioRangeSeekBar.this.f23454a > AudioRangeSeekBar.this.f23455b) {
                        AudioRangeSeekBar audioRangeSeekBar4 = AudioRangeSeekBar.this;
                        audioRangeSeekBar4.f23454a = audioRangeSeekBar4.f23455b;
                    }
                    AudioRangeSeekBar audioRangeSeekBar5 = AudioRangeSeekBar.this;
                    audioRangeSeekBar5.f23469p = audioRangeSeekBar5.f23454a;
                    AudioRangeSeekBar.this.w();
                    AudioRangeSeekBar.this.x();
                } else if (i11 == 2) {
                    AudioRangeSeekBar.this.f23455b = this.f23480a;
                    if (AudioRangeSeekBar.this.f23455b > AudioRangeSeekBar.this.f23457d) {
                        AudioRangeSeekBar audioRangeSeekBar6 = AudioRangeSeekBar.this;
                        audioRangeSeekBar6.f23455b = audioRangeSeekBar6.f23457d;
                    }
                    if (AudioRangeSeekBar.this.f23455b < AudioRangeSeekBar.this.f23454a) {
                        AudioRangeSeekBar audioRangeSeekBar7 = AudioRangeSeekBar.this;
                        audioRangeSeekBar7.f23455b = audioRangeSeekBar7.f23454a;
                    }
                    AudioRangeSeekBar audioRangeSeekBar8 = AudioRangeSeekBar.this;
                    audioRangeSeekBar8.f23469p = audioRangeSeekBar8.f23455b;
                    AudioRangeSeekBar.this.w();
                    AudioRangeSeekBar.this.x();
                } else if (i11 == 3) {
                    AudioRangeSeekBar.this.f23469p = this.f23480a;
                    AudioRangeSeekBar.this.q();
                    AudioRangeSeekBar.this.u();
                    AudioRangeSeekBar.this.invalidate();
                }
                this.f23482c = this.f23480a;
                this.f23483d = this.f23481b;
            }
            return true;
        }
    }

    public AudioRangeSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23458e = getResources().getDimensionPixelSize(R.dimen.audio_trim_bound_width);
        this.f23460g = 0;
        this.f23463j = new Paint();
        this.f23464k = getResources().getColor(R.color.sunset_orange);
        this.f23465l = getResources().getColor(R.color.red_orange);
        this.f23466m = getResources().getColor(R.color.tundora_opacity);
        this.f23467n = getResources().getDimensionPixelSize(R.dimen.scrubber_width);
        this.f23468o = getResources().getDimensionPixelSize(R.dimen.audio_scrubber_height);
        this.f23470q = getResources().getDimensionPixelSize(R.dimen.audio_bound_padding_x);
        this.f23471r = getResources().getDimensionPixelSize(R.dimen.trim_text_size);
        this.f23474u = getResources().getDimensionPixelSize(R.dimen.trim_text_margin);
        this.f23475v = getResources().getDimensionPixelSize(R.dimen.bound_stroke_width);
        this.B = "";
        this.C = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        int i10 = this.f23469p;
        int i11 = this.f23454a;
        if (i10 < i11) {
            this.f23469p = i11;
        }
        int i12 = this.f23469p;
        int i13 = this.f23455b;
        if (i12 > i13) {
            this.f23469p = i13;
        }
    }

    private long r(int i10) {
        return Math.round(((double) (i10 - this.f23456c)) / this.f23476w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        this.f23477x.b(r(this.f23469p));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        this.f23459f = (this.f23454a + this.f23455b) / 2;
        Path path = new Path();
        this.f23461h = path;
        path.moveTo(this.f23454a - (this.f23458e / 2.0f), this.f23478y);
        this.f23461h.lineTo(this.f23454a + (this.f23458e / 2.0f), this.f23478y);
        this.f23461h.lineTo(this.f23454a, this.f23478y + (this.f23458e / 2.0f));
        this.f23461h.moveTo(this.f23454a, this.f23479z - (this.f23458e / 2.0f));
        this.f23461h.lineTo(this.f23454a - (this.f23458e / 2.0f), this.f23479z);
        this.f23461h.lineTo(this.f23454a + (this.f23458e / 2.0f), this.f23479z);
        Path path2 = new Path();
        this.f23462i = path2;
        path2.moveTo(this.f23455b - (this.f23458e / 2.0f), this.f23478y);
        this.f23462i.lineTo(this.f23455b + (this.f23458e / 2.0f), this.f23478y);
        this.f23462i.lineTo(this.f23455b, this.f23478y + (this.f23458e / 2.0f));
        this.f23462i.moveTo(this.f23455b, this.f23479z - (this.f23458e / 2.0f));
        this.f23462i.lineTo(this.f23455b + (this.f23458e / 2.0f), this.f23479z);
        this.f23462i.lineTo(this.f23455b - (this.f23458e / 2.0f), this.f23479z);
        this.B = l0.c(r(this.f23454a));
        this.C = l0.c(r(this.f23455b));
        this.f23472s = this.f23463j.measureText(this.B);
        this.f23473t = this.f23463j.measureText(this.C);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        this.f23477x.a(r(this.f23454a), r(this.f23455b));
    }

    public long getLeftBoundTime() {
        return r(this.f23454a);
    }

    public long getRightBoundTime() {
        return r(this.f23455b);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f23463j.setColor(this.f23464k);
        this.f23463j.setStrokeWidth(this.f23475v);
        float f10 = this.f23454a;
        int i10 = this.A;
        canvas.drawLine(f10, i10, this.f23455b, i10, this.f23463j);
        this.f23463j.setColor(-12303292);
        int i11 = this.f23454a;
        int i12 = this.f23456c;
        if (i11 > i12) {
            float f11 = i12;
            int i13 = this.A;
            canvas.drawLine(f11, i13, i11, i13, this.f23463j);
        }
        int i14 = this.f23455b;
        int i15 = this.f23457d;
        if (i14 < i15) {
            float f12 = i14;
            int i16 = this.A;
            canvas.drawLine(f12, i16, i15, i16, this.f23463j);
        }
        this.f23463j.setStrokeWidth(this.f23475v);
        this.f23463j.setColor(this.f23460g == 1 ? this.f23465l : this.f23464k);
        canvas.drawPath(this.f23461h, this.f23463j);
        int i17 = this.f23454a;
        canvas.drawLine(i17, this.f23478y, i17, this.f23479z, this.f23463j);
        this.f23463j.setColor(this.f23460g == 2 ? this.f23465l : this.f23464k);
        canvas.drawPath(this.f23462i, this.f23463j);
        int i18 = this.f23455b;
        canvas.drawLine(i18, this.f23478y, i18, this.f23479z, this.f23463j);
        this.f23463j.setColor(-1);
        this.f23463j.setStrokeWidth(this.f23467n);
        int i19 = this.f23469p;
        int i20 = this.A;
        int i21 = this.f23468o;
        canvas.drawLine(i19, i20 - (i21 / 2.0f), i19, i20 + (i21 / 2.0f), this.f23463j);
        canvas.drawText(this.B, this.f23454a - (this.f23472s / 2.0f), this.f23478y - this.f23474u, this.f23463j);
        canvas.drawText(this.C, this.f23455b - (this.f23473t / 2.0f), this.f23478y - this.f23474u, this.f23463j);
    }

    public void s(long j10, long j11) {
        this.f23454a = (int) (Math.round(j10 * this.f23476w) + ((long) this.f23456c));
        this.f23455b = (int) (Math.round(j11 * this.f23476w) + ((long) this.f23456c));
        w();
    }

    public void t(long j10, int i10, int i11, int i12, int i13, b bVar) {
        this.f23456c = i10;
        this.f23457d = i11;
        this.f23478y = i12;
        this.f23479z = i13;
        this.A = (i12 + i13) / 2;
        this.f23476w = ((double) (i11 - i10)) / j10;
        this.f23454a = i10;
        this.f23455b = i11;
        this.f23469p = i10;
        this.f23463j.setTextSize(this.f23471r);
        setOnTouchListener(new c());
        this.f23477x = bVar;
        w();
    }

    public void v(long j10) {
        this.f23469p = (int) (((double) this.f23456c) + (j10 * this.f23476w));
        q();
        wp.a.a(mTFeqtajA.wEP, Long.valueOf(j10), Integer.valueOf(this.f23469p));
        invalidate();
    }
}

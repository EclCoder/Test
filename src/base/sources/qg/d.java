package qg;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.AdError;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import java.io.File;
import nh.j0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WindowManager f50777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WindowManager.LayoutParams f50778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private LinearLayout f50779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private TextView f50780g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    lg.a f50782i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f50774a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f50775b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f50776c = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f50781h = AzRecorderApp.e().getApplicationContext();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f50783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f50784b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f50785c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f50786d;

        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f50783a = d.this.f50778e.x;
                this.f50784b = d.this.f50778e.y;
                this.f50785c = rawX;
                this.f50786d = rawY;
                return true;
            }
            if (action != 2) {
                return true;
            }
            int i10 = rawX - this.f50785c;
            int i11 = rawY - this.f50786d;
            if (!d.this.f50776c || Math.max(Math.abs(i10), Math.abs(i11)) <= 10) {
                return true;
            }
            d.this.f50778e.x = this.f50783a + i10;
            d.this.f50778e.y = this.f50784b + i11;
            d.this.f50777d.updateViewLayout(view, d.this.f50778e);
            return true;
        }
    }

    private void e() {
        this.f50777d = (WindowManager) this.f50781h.getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, AzRecorderApp.e().f(), 262184, -3);
        this.f50778e = layoutParams;
        layoutParams.x = this.f50782i.d(R.string.pref_watermark_pos_x, 0);
        this.f50778e.y = this.f50782i.d(R.string.pref_watermark_pos_y, 0);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.f50781h).inflate(R.layout.watermark_layout, (ViewGroup) null);
        this.f50779f = linearLayout;
        linearLayout.setOnTouchListener(new a());
        this.f50780g = (TextView) this.f50779f.findViewById(R.id.watermark);
        this.f50775b = true;
        g();
        j();
        k();
        i();
        h();
    }

    public void d() {
        if (!this.f50775b) {
            e();
        }
        if (this.f50774a) {
            this.f50777d.removeView(this.f50779f);
            this.f50774a = false;
        }
    }

    public void f() {
        if (this.f50775b) {
            d();
            this.f50782i.k(R.string.pref_watermark_pos_x, this.f50778e.x);
            this.f50782i.k(R.string.pref_watermark_pos_y, this.f50778e.y);
        }
    }

    public void g() {
        if (!this.f50775b) {
            e();
        }
        this.f50779f.setBackgroundColor(this.f50782i.d(R.string.pref_watermark_bg_color, 0));
    }

    public void h() {
        if (!this.f50775b) {
            e();
        }
        String strH = this.f50782i.h(R.string.pref_watermark_font, AdError.UNDEFINED_DOMAIN);
        if (AdError.UNDEFINED_DOMAIN.equals(strH)) {
            return;
        }
        if (new File(strH).exists()) {
            this.f50780g.setTypeface(Typeface.createFromFile(strH));
        } else {
            j0.b(this.f50781h, R.string.toast_cannot_load_font);
        }
    }

    public void i() {
        if (!this.f50775b) {
            e();
        }
        this.f50780g.setText(this.f50782i.h(R.string.pref_watermark_text, this.f50781h.getString(R.string.app_name)));
    }

    public void j() {
        if (!this.f50775b) {
            e();
        }
        this.f50780g.setTextColor(this.f50782i.d(R.string.pref_watermark_text_color, -65536));
    }

    public void k() {
        if (!this.f50775b) {
            e();
        }
        this.f50780g.setTextSize(Integer.parseInt(this.f50782i.h(R.string.pref_watermark_text_size, "30")));
    }

    public void l() {
        if (!this.f50775b) {
            e();
        }
        if (this.f50774a) {
            return;
        }
        try {
            this.f50777d.addView(this.f50779f, this.f50778e);
            this.f50774a = true;
        } catch (Exception e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
        }
    }
}

package qg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import nh.f0;
import nh.j0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WindowManager f50762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WindowManager.LayoutParams f50763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private LinearLayout f50764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ImageView f50765g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    lg.a f50767i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f50759a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f50760b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f50761c = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f50766h = AzRecorderApp.e().getApplicationContext();

    /* JADX INFO: renamed from: qg.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class ViewOnTouchListenerC0783a implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f50768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f50769b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f50770c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f50771d;

        ViewOnTouchListenerC0783a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f50768a = a.this.f50763e.x;
                this.f50769b = a.this.f50763e.y;
                this.f50770c = rawX;
                this.f50771d = rawY;
                return true;
            }
            if (action != 2) {
                return true;
            }
            int i10 = rawX - this.f50770c;
            int i11 = rawY - this.f50771d;
            if (!a.this.f50761c || Math.max(Math.abs(i10), Math.abs(i11)) <= 10) {
                return true;
            }
            a.this.f50763e.x = this.f50768a + i10;
            a.this.f50763e.y = this.f50769b + i11;
            a.this.f50762d.updateViewLayout(view, a.this.f50763e);
            return true;
        }
    }

    private void e() {
        this.f50762d = (WindowManager) this.f50766h.getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, AzRecorderApp.e().f(), 262184, -3);
        this.f50763e = layoutParams;
        layoutParams.x = this.f50767i.d(R.string.pref_logo_pos_x, 0);
        this.f50763e.y = this.f50767i.d(R.string.pref_logo_pos_y, 0);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.f50766h).inflate(R.layout.logo_layout, (ViewGroup) null);
        this.f50764f = linearLayout;
        linearLayout.setOnTouchListener(new ViewOnTouchListenerC0783a());
        this.f50765g = (ImageView) this.f50764f.findViewById(R.id.logo);
        this.f50760b = true;
        h();
    }

    public void d() {
        if (!this.f50760b) {
            e();
        }
        if (this.f50759a) {
            this.f50762d.removeView(this.f50764f);
            this.f50759a = false;
        }
    }

    public void f() {
        if (this.f50760b) {
            d();
            this.f50767i.k(R.string.pref_logo_pos_x, this.f50763e.x);
            this.f50767i.k(R.string.pref_logo_pos_y, this.f50763e.y);
        }
    }

    public void g() {
        if (!this.f50760b) {
            e();
        }
        if (this.f50759a) {
            return;
        }
        try {
            this.f50762d.addView(this.f50764f, this.f50763e);
            this.f50759a = true;
        } catch (Exception e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
        }
    }

    public void h() {
        Bitmap bitmapDecodeFile;
        int i10;
        int i11;
        if (!this.f50760b) {
            e();
        }
        String strH = this.f50767i.h(R.string.pref_logo_url, DevicePublicKeyStringDef.NONE);
        if (DevicePublicKeyStringDef.NONE.equals(strH)) {
            bitmapDecodeFile = null;
        } else {
            try {
                bitmapDecodeFile = BitmapFactory.decodeFile(strH);
            } catch (Exception unused) {
                j0.b(this.f50766h, R.string.toast_cannot_load_logo);
                bitmapDecodeFile = null;
            }
        }
        if (bitmapDecodeFile == null) {
            bitmapDecodeFile = BitmapFactory.decodeResource(this.f50766h.getResources(), R.drawable.ic_app_icon);
            this.f50767i.m(R.string.pref_logo_url, DevicePublicKeyStringDef.NONE);
            this.f50767i.m(R.string.pref_logo_image_path, "App Icon");
        }
        int iG = nh.b.g(this.f50766h);
        int iE = nh.b.e(this.f50766h);
        float fC = this.f50767i.c(R.string.pref_logo_size, 0.2f);
        float height = (bitmapDecodeFile.getHeight() * 1.0f) / bitmapDecodeFile.getWidth();
        if (Math.min(iG, iE) == iG) {
            i11 = (int) (iG * fC);
            i10 = (int) (height * i11);
        } else {
            i10 = (int) (iE * fC);
            i11 = (int) (i10 / height);
        }
        this.f50765g.setImageBitmap(f0.w(bitmapDecodeFile, i10, i11));
    }
}

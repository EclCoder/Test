package dh;

import android.content.Context;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WindowManager f36855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Animation f36857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Animation f36858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f36859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f36860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f36861g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f36862h = AzRecorderApp.e().getApplicationContext();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
        void a();

        void b();

        void c();

        void d();
    }

    public b(int i10) {
        this.f36856b = i10;
    }

    public static /* synthetic */ void a(b bVar, long[] jArr, c cVar, View view) {
        bVar.getClass();
        if (SystemClock.elapsedRealtime() - jArr[0] < 300) {
            return;
        }
        jArr[0] = SystemClock.elapsedRealtime();
        bVar.j(cVar);
    }

    static /* synthetic */ int g(b bVar) {
        int i10 = bVar.f36856b;
        bVar.f36856b = i10 - 1;
        return i10;
    }

    private void j(c cVar) {
        if (this.f36861g) {
            return;
        }
        this.f36861g = true;
        Animation animation = this.f36857c;
        if (animation != null) {
            animation.setAnimationListener(null);
        }
        Animation animation2 = this.f36858d;
        if (animation2 != null) {
            animation2.setAnimationListener(null);
        }
        TextView textView = this.f36860f;
        if (textView != null) {
            textView.clearAnimation();
        }
        cVar.d();
        i();
        cVar.a();
    }

    public void i() {
        View view = this.f36859e;
        if (view == null || !view.isAttachedToWindow()) {
            return;
        }
        this.f36855a.removeView(this.f36859e);
        this.f36859e = null;
        this.f36860f = null;
    }

    public void k(final c cVar) {
        this.f36855a = (WindowManager) this.f36862h.getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, AzRecorderApp.e().f(), 262184, -3);
        layoutParams.x = 0;
        layoutParams.y = 0;
        layoutParams.gravity = 17;
        View viewInflate = ((LayoutInflater) this.f36862h.getSystemService("layout_inflater")).inflate(R.layout.count_down_timer, (ViewGroup) null);
        this.f36859e = viewInflate;
        this.f36860f = (TextView) viewInflate.findViewById(R.id.countdown_text);
        final long[] jArr = {0};
        ((Button) this.f36859e.findViewById(R.id.btn_start_now)).setOnClickListener(new View.OnClickListener() { // from class: dh.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b.a(this.f36852a, jArr, cVar, view);
            }
        });
        this.f36855a.addView(this.f36859e, layoutParams);
        this.f36860f.setText(String.valueOf(this.f36856b));
        this.f36857c = AnimationUtils.loadAnimation(this.f36862h, R.anim.scale_up);
        this.f36858d = AnimationUtils.loadAnimation(this.f36862h, R.anim.fade_out);
        this.f36857c.setAnimationListener(new a());
        this.f36858d.setAnimationListener(new AnimationAnimationListenerC0554b(cVar));
        this.f36860f.startAnimation(this.f36857c);
        cVar.b();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (b.this.f36861g) {
                return;
            }
            b.this.f36860f.startAnimation(b.this.f36858d);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            b.this.f36860f.setVisibility(0);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: dh.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class AnimationAnimationListenerC0554b implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f36864a;

        AnimationAnimationListenerC0554b(c cVar) {
            this.f36864a = cVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (b.this.f36861g) {
                return;
            }
            b.this.f36860f.setVisibility(4);
            if (b.this.f36856b <= 1) {
                b.this.f36861g = true;
                b.this.i();
                this.f36864a.a();
            } else {
                b.g(b.this);
                if (b.this.f36856b == 1) {
                    this.f36864a.c();
                }
                b.this.f36860f.setText(String.valueOf(b.this.f36856b));
                b.this.f36860f.startAnimation(b.this.f36857c);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }
}

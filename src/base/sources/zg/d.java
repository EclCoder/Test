package zg;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.hecorat.screenrecorder.free.R;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class d extends f {
    public static final a B = new a(null);
    private int A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ImageView f58833w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final ImageView f58834x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final TextView f58835y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final CardView f58836z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        kotlin.jvm.internal.s.h(context, "context");
        this.A = 50;
        Object systemService = context.getSystemService("layout_inflater");
        kotlin.jvm.internal.s.f(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.bubble_center_view, (ViewGroup) null);
        kotlin.jvm.internal.s.f(viewInflate, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        CardView cardView = (CardView) viewInflate;
        this.f58836z = cardView;
        this.f58833w = (ImageView) cardView.findViewById(R.id.icon_iv);
        this.f58835y = (TextView) cardView.findViewById(R.id.timer_tv);
        this.f58834x = (ImageView) cardView.findViewById(R.id.mini_iv);
        d(cardView);
    }

    private final void a0() {
        float fL = l() * (N() ? -0.5f : 0.5f);
        this.f58836z.setScaleX(0.5f);
        this.f58836z.setScaleY(0.5f);
        this.f58836z.setAlpha(0.4f);
        this.f58836z.setX(fL);
    }

    private final ViewPropertyAnimator c0() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate = this.f58836z.animate();
        kotlin.jvm.internal.s.g(viewPropertyAnimatorAnimate, "animate(...)");
        return viewPropertyAnimatorAnimate;
    }

    @Override // zg.f
    public int F() {
        return this.A;
    }

    @Override // zg.f
    public void R(int i10) {
        this.A = i10;
    }

    public final void Z() {
        c0().scaleX(0.8f).scaleY(0.8f).alpha(0.6f).x(l() * (N() ? -0.2f : 0.2f)).setDuration(200L).start();
    }

    public final void b0() {
        this.f58836z.setScaleX(1.0f);
        this.f58836z.setScaleY(1.0f);
        this.f58836z.setAlpha(1.0f);
        this.f58836z.setX(0.0f);
    }

    public final boolean d0() {
        return this.f58834x.getVisibility() == 0;
    }

    public final boolean e0() {
        return !(this.f58836z.getAlpha() == 1.0f);
    }

    public final void f0(String str) {
        if (str != null) {
            com.bumptech.glide.c.z(this.f58881e).r(Uri.parse(str).buildUpon().scheme("https").build()).b(((i6.f) new i6.f().X(R.drawable.loading_animation)).j(R.drawable.ic_account_circle_black_48dp)).A0(this.f58833w);
        }
    }

    public final void g0(int i10) {
        if (i10 == 0) {
            this.f58833w.setVisibility(0);
            this.f58835y.setVisibility(8);
            this.f58834x.setVisibility(8);
        } else if (i10 == 1) {
            this.f58833w.setVisibility(8);
            this.f58835y.setVisibility(0);
            this.f58834x.setVisibility(8);
        } else {
            if (i10 != 2) {
                return;
            }
            a0();
            this.f58833w.setVisibility(8);
            this.f58835y.setVisibility(8);
            this.f58834x.setVisibility(0);
        }
    }

    public final void h0(long j10) {
        TextView textView = this.f58835y;
        o0 o0Var = o0.f43602a;
        long j11 = 60;
        String str = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j10 / j11), Long.valueOf(j10 % j11)}, 2));
        kotlin.jvm.internal.s.g(str, "format(...)");
        textView.setText(str);
        this.f58835y.invalidate();
    }

    @Override // zg.o
    protected int i() {
        return super.i() | 256;
    }

    public final void i0(Animation animation) {
        kotlin.jvm.internal.s.h(animation, "animation");
        this.f58835y.startAnimation(animation);
    }

    @Override // zg.o
    protected int j() {
        return this.f58881e.getResources().getDimensionPixelSize(R.dimen.size_button_bubble);
    }

    public final void j0() {
        this.f58835y.clearAnimation();
    }

    @Override // zg.o
    protected int l() {
        return this.f58881e.getResources().getDimensionPixelSize(R.dimen.size_button_bubble);
    }
}

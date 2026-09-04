package bh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.hecorat.screenrecorder.free.R;
import zg.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class g extends o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final LinearLayout f8949g;

    public g(Context context) {
        super(context);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.draw_action_bar, (ViewGroup) null);
        this.f8949g = linearLayout;
        d(linearLayout);
        WindowManager.LayoutParams layoutParams = this.f58878b;
        layoutParams.gravity = 8388693;
        layoutParams.x = context.getResources().getDimensionPixelSize(R.dimen.margin_start_setting);
        this.f58878b.flags = 32;
    }

    @Override // zg.o
    protected int j() {
        return -2;
    }

    @Override // zg.o
    protected int l() {
        return -2;
    }

    public void p(View.OnKeyListener onKeyListener) {
        this.f8949g.setOnKeyListener(onKeyListener);
    }

    public void q(View.OnClickListener onClickListener) {
        this.f8949g.findViewById(R.id.draw_settings_ib).setOnClickListener(onClickListener);
        this.f8949g.findViewById(R.id.btn_erase_previous).setOnClickListener(onClickListener);
        this.f8949g.findViewById(R.id.btn_clear_all).setOnClickListener(onClickListener);
        this.f8949g.findViewById(R.id.btn_exit_drawing).setOnClickListener(onClickListener);
        this.f8949g.findViewById(R.id.screenshot_ib).setOnClickListener(onClickListener);
    }

    public void r() {
        e();
        this.f8949g.setFocusableInTouchMode(true);
        this.f8949g.requestFocus();
    }
}

package ch;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import com.hecorat.screenrecorder.free.R;
import kotlin.jvm.internal.s;
import tf.e7;
import zg.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e7 f9989g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        s.h(context, "context");
        Object systemService = context.getSystemService("layout_inflater");
        s.f(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        e7 e7VarY = e7.Y((LayoutInflater) systemService);
        this.f9989g = e7VarY;
        e7VarY.C.setSelected(true);
        d(e7VarY.B());
        WindowManager.LayoutParams layoutParams = this.f58878b;
        layoutParams.flags = 552;
        layoutParams.format = -3;
        layoutParams.gravity = 8388691;
        layoutParams.x = 0;
        layoutParams.y = 50;
    }

    @Override // zg.o
    protected int j() {
        return -2;
    }

    @Override // zg.o
    protected int l() {
        return -2;
    }

    public final void p() {
        this.f9989g.B.setImageResource(R.drawable.ic_expand_chat);
        this.f9989g.C.setVisibility(8);
    }

    public final void q() {
        this.f9989g.B.setImageResource(R.drawable.ic_collapse_chat);
        this.f9989g.C.setVisibility(0);
    }

    public final boolean r() {
        return this.f9989g.C.getVisibility() == 8;
    }

    public final void s(String text) {
        s.h(text, "text");
        this.f9989g.C.setText(text);
    }

    public final void t(View.OnClickListener listener) {
        s.h(listener, "listener");
        this.f9989g.A.setOnClickListener(listener);
    }
}

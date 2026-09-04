package eh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.hecorat.screenrecorder.free.R;
import kotlin.jvm.internal.s;
import zg.r;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends r {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f37887w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        s.h(context, "context");
        this.f37887w = 30;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.btn_screenshot, (ViewGroup) null);
        s.e(viewInflate);
        d(viewInflate);
    }

    @Override // zg.f
    public int F() {
        return this.f37887w;
    }

    @Override // zg.f
    public void R(int i10) {
        this.f37887w = i10;
    }
}

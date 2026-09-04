package com.hecorat.screenrecorder.free.videoeditor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.RequestConfiguration;
import com.hecorat.screenrecorder.free.videoeditor.ChangeRatioFragment;
import com.mbridge.msdk.MBridgeConstans;
import fl.g0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import tf.k3;
import uh.y;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0004R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/hecorat/screenrecorder/free/videoeditor/ChangeRatioFragment;", "Lcom/hecorat/screenrecorder/free/videoeditor/d;", "Ltf/k3;", "<init>", "()V", "Lqh/h;", "ratioItem", "Lfl/g0;", "H", "(Lqh/h;)V", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroid/view/ViewGroup;", "container", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ltf/k3;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "C", "Lph/h;", "c", "Lph/h;", "adapter", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChangeRatioFragment extends d<k3> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public ph.h adapter;

    private final void H(qh.h ratioItem) {
        ph.h hVar = this.adapter;
        if (hVar == null) {
            s.w("adapter");
            hVar = null;
        }
        hVar.j(ratioItem);
        v().z1(ratioItem);
    }

    public static final g0 I(ChangeRatioFragment changeRatioFragment, qh.h ratioItem) {
        s.h(ratioItem, "ratioItem");
        changeRatioFragment.H(ratioItem);
        return g0.f38750a;
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.d
    public void C() {
        super.C();
        y yVarV = v();
        ph.h hVar = this.adapter;
        if (hVar == null) {
            s.w("adapter");
            hVar = null;
        }
        yVarV.V1(hVar.l());
        v().y1(null);
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.d
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public k3 x(LayoutInflater layoutInflater, ViewGroup container) {
        s.h(layoutInflater, "layoutInflater");
        k3 k3VarY = k3.Y(layoutInflater, container, false);
        s.g(k3VarY, "inflate(...)");
        return k3VarY;
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        s.h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ((k3) w()).a0(v());
        this.adapter = new ph.h(new Function1() { // from class: oh.i1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChangeRatioFragment.I(this.f48696a, (qh.h) obj);
            }
        });
        RecyclerView recyclerView = ((k3) w()).E;
        ph.h hVar = this.adapter;
        ph.h hVar2 = null;
        if (hVar == null) {
            s.w("adapter");
            hVar = null;
        }
        recyclerView.setAdapter(hVar);
        ph.h hVar3 = this.adapter;
        if (hVar3 == null) {
            s.w("adapter");
            hVar3 = null;
        }
        hVar3.i(v().r0());
        ph.h hVar4 = this.adapter;
        if (hVar4 == null) {
            s.w("adapter");
        } else {
            hVar2 = hVar4;
        }
        hVar2.p(v().q0());
    }
}

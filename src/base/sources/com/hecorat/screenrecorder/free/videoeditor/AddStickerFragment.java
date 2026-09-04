package com.hecorat.screenrecorder.free.videoeditor;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.k0;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.videoeditor.AddStickerFragment;
import com.mbridge.msdk.MBridgeConstans;
import gl.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.s;
import oh.w2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\rJ!\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0003J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/hecorat/screenrecorder/free/videoeditor/AddStickerFragment;", "Lcom/hecorat/screenrecorder/free/videoeditor/b;", "<init>", "()V", "Lng/b;", "imageItem", "Lfl/g0;", "p0", "(Lng/b;)V", "q0", "Lqh/c;", "drawableItem", "u0", "(Lqh/c;)V", "item", "t0", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Y", "Z", "", "Lqh/k;", "U", "()Ljava/util/List;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AddStickerFragment extends b {
    public static final void n0(com.google.android.material.bottomsheet.a aVar, AddStickerFragment addStickerFragment, View view) {
        aVar.dismiss();
        g.INSTANCE.a(true).show(addStickerFragment.getChildFragmentManager(), "ImagePicker_single");
    }

    public static final void o0(com.google.android.material.bottomsheet.a aVar, AddStickerFragment addStickerFragment, View view) {
        aVar.dismiss();
        new w2().show(addStickerFragment.getChildFragmentManager(), "PickStickerFragment");
    }

    private final void p0(ng.b imageItem) {
        u0(v().Z(imageItem, false));
    }

    private final void q0(ng.b imageItem) {
        u0(v().Z(imageItem, true));
    }

    public static final void r0(AddStickerFragment addStickerFragment, String str, Bundle bundle) {
        s.h(str, "<unused var>");
        s.h(bundle, "bundle");
        ng.b bVar = Build.VERSION.SDK_INT >= 33 ? (ng.b) bundle.getParcelable("image_single", ng.b.class) : (ng.b) bundle.getParcelable("image_single");
        if (bVar != null) {
            addStickerFragment.p0(bVar);
        }
    }

    public static final void s0(AddStickerFragment addStickerFragment, String str, Bundle bundle) {
        s.h(str, "<unused var>");
        s.h(bundle, "bundle");
        ng.b bVar = Build.VERSION.SDK_INT >= 33 ? (ng.b) bundle.getParcelable("sticker_single", ng.b.class) : (ng.b) bundle.getParcelable("sticker_single");
        if (bVar != null) {
            addStickerFragment.q0(bVar);
        }
    }

    private final void t0(qh.c item) {
        List listH0 = v().H0();
        int iIndexOf = listH0.indexOf(item);
        long videoListDuration = (iIndexOf == -1 || iIndexOf == r.n(listH0) || listH0.size() < 2) ? getVideoListDuration() : ((qh.c) listH0.get(iIndexOf + 1)).c() - 1;
        long jE = yl.g.e((videoListDuration - item.c()) - 1, 0L);
        if (item.c() + item.b() > videoListDuration) {
            item.e(jE);
        }
    }

    private final void u0(qh.c drawableItem) {
        t0(drawableItem);
        S(drawableItem);
        v().n0().q(drawableItem);
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.a
    protected List U() {
        List listH0 = v().H0();
        s.f(listH0, "null cannot be cast to non-null type kotlin.collections.MutableList<com.hecorat.screenrecorder.free.videoeditor.data.TimelineItem>");
        return p0.c(listH0);
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.a
    public void Y() {
        final com.google.android.material.bottomsheet.a aVar = new com.google.android.material.bottomsheet.a(requireContext());
        aVar.setContentView(R.layout.bottom_sheet_image_type_picker);
        aVar.show();
        ConstraintLayout constraintLayout = (ConstraintLayout) aVar.findViewById(R.id.image_layout);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: oh.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AddStickerFragment.n0(aVar, this, view);
                }
            });
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) aVar.findViewById(R.id.sticker_layout);
        if (constraintLayout2 != null) {
            constraintLayout2.setOnClickListener(new View.OnClickListener() { // from class: oh.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AddStickerFragment.o0(aVar, this, view);
                }
            });
        }
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.a
    public void Z() {
        Y();
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.b, com.hecorat.screenrecorder.free.videoeditor.a, com.hecorat.screenrecorder.free.videoeditor.d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        s.h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getChildFragmentManager().z1("req_image_single", getViewLifecycleOwner(), new k0() { // from class: oh.q
            @Override // androidx.fragment.app.k0
            public final void a(String str, Bundle bundle) {
                AddStickerFragment.r0(this.f48781a, str, bundle);
            }
        });
        getChildFragmentManager().z1("req_sticker_single", getViewLifecycleOwner(), new k0() { // from class: oh.r
            @Override // androidx.fragment.app.k0
            public final void a(String str, Bundle bundle) {
                AddStickerFragment.s0(this.f48827a, str, bundle);
            }
        });
    }
}

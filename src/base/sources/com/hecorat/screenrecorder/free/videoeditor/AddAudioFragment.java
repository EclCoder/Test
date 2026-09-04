package com.hecorat.screenrecorder.free.videoeditor;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.fragment.app.k0;
import androidx.lifecycle.q0;
import com.google.android.material.slider.Slider;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.videoeditor.AddAudioFragment;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import fl.g0;
import fl.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.s;
import lg.r;
import oh.b0;
import tf.a3;
import vh.i0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ!\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010\u0004J\u0017\u0010!\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b!\u0010\u000eJ\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\"\u0010\u000eJ\u0015\u0010$\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020#¢\u0006\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/hecorat/screenrecorder/free/videoeditor/AddAudioFragment;", "Lcom/hecorat/screenrecorder/free/videoeditor/a;", "Lcom/hecorat/screenrecorder/free/videoeditor/c$a;", "<init>", "()V", "Lfl/g0;", "v0", "", "audioId", "x0", "(Ljava/lang/String;)V", "Lqh/a;", "audioItem", "y0", "(Lqh/a;)V", "w0", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lqh/l;", "visualItem", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "(Lqh/l;)V", "Y", "Z", "", "Lqh/k;", "U", "()Ljava/util/List;", "p0", "g", "o", "Lng/a;", "o0", "(Lng/a;)V", "Lvh/h;", "m", "Lvh/h;", "permissionCallback", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AddAudioFragment extends com.hecorat.screenrecorder.free.videoeditor.a implements c.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final vh.h permissionCallback = new vh.h() { // from class: oh.c
        @Override // vh.h
        public final void b(List list, boolean z10) {
            AddAudioFragment.u0(this.f48626a, list, z10);
        }
    };

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a implements kotlin.jvm.internal.m, q0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f23193a;

        public a(Function1 function) {
            s.h(function, "function");
            this.f23193a = function;
        }

        @Override // kotlin.jvm.internal.m
        public final fl.g a() {
            return this.f23193a;
        }

        @Override // androidx.lifecycle.q0
        public final /* synthetic */ void d(Object obj) {
            this.f23193a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof q0) && (obj instanceof kotlin.jvm.internal.m)) {
                return s.c(a(), ((kotlin.jvm.internal.m) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public static final void q0(AddAudioFragment addAudioFragment, Slider slider, float f10, boolean z10) {
        s.h(slider, "<unused var>");
        addAudioFragment.v().i2(f10);
    }

    public static final void r0(com.google.android.material.bottomsheet.a aVar, View view) {
        aVar.dismiss();
    }

    public static final void s0(AddAudioFragment addAudioFragment, String str, Bundle bundle) {
        s.h(str, "<unused var>");
        s.h(bundle, "bundle");
        ng.a aVar = Build.VERSION.SDK_INT >= 33 ? (ng.a) bundle.getParcelable("audio_single", ng.a.class) : (ng.a) bundle.getParcelable("audio_single");
        if (aVar != null) {
            addAudioFragment.o0(aVar);
        }
    }

    public static final g0 t0(AddAudioFragment addAudioFragment, Long l10) {
        List<qh.a> listP0 = addAudioFragment.v().p0();
        if (!listP0.isEmpty()) {
            qh.k kVar = (qh.k) addAudioFragment.v().n0().f();
            if (kVar != null && (l10.longValue() < kVar.c() || l10.longValue() > kVar.c() + kVar.b())) {
                addAudioFragment.v().n0().q(null);
            }
            for (qh.a aVar : listP0) {
                if (l10.longValue() >= aVar.c() && l10.longValue() <= aVar.c() + aVar.b()) {
                    addAudioFragment.v().n0().q(aVar);
                    wp.a.a("One element added", new Object[0]);
                    break;
                }
            }
        }
        return g0.f38750a;
    }

    public static final void u0(AddAudioFragment addAudioFragment, List list, boolean z10) {
        s.h(list, "<unused var>");
        if (z10) {
            addAudioFragment.v0();
        }
    }

    private final void v0() {
        new b0().show(getChildFragmentManager(), "AudioPickerFragment");
    }

    private final void w0(qh.a audioItem) {
        long jC;
        List listP0 = v().p0();
        int iIndexOf = listP0.indexOf(audioItem);
        if (iIndexOf == listP0.size() - 1) {
            jC = getVideoListDuration();
        } else {
            jC = listP0.size() >= 2 ? ((qh.a) listP0.get(iIndexOf + 1)).c() - 1 : 0L;
        }
        if (audioItem.g()) {
            audioItem.e(jC);
            return;
        }
        audioItem.e(audioItem.j() - audioItem.k());
        if (audioItem.c() + audioItem.b() > jC) {
            audioItem.e((jC - audioItem.c()) - 1);
        }
    }

    private final void x0(String audioId) {
        c cVar = new c();
        cVar.J(this);
        Bundle bundle = new Bundle();
        bundle.putString("audio_item_id", audioId);
        cVar.setArguments(bundle);
        cVar.show(getChildFragmentManager(), "AudioSettingsDialogFragment");
    }

    private final void y0(qh.a audioItem) {
        q qVarT = T(audioItem.c(), audioItem.b());
        ((a3) w()).D.H(audioItem.getId(), ((Number) qVarT.h()).intValue(), ((Number) qVarT.i()).intValue());
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.a
    protected List U() {
        List listP0 = v().p0();
        s.f(listP0, "null cannot be cast to non-null type kotlin.collections.MutableList<com.hecorat.screenrecorder.free.videoeditor.data.TimelineItem>");
        return p0.c(listP0);
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.a
    public void Y() {
        i0.k(this).g("android.permission.READ_MEDIA_AUDIO").b(new r()).h(this.permissionCallback);
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.a
    public void Z() {
        qh.k kVar = (qh.k) v().n0().f();
        if (kVar != null) {
            x0(kVar.getId());
        }
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.view.VideoElementSeekBar.b
    public void d(qh.l visualItem) {
        if (visualItem != null) {
            v().C1();
            x0(visualItem.getId());
        }
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.c.a
    public void g(qh.a audioItem) {
        s.h(audioItem, "audioItem");
        ((a3) w()).D.F(audioItem.getId());
        for (qh.a aVar : v().p0()) {
            if (s.c(aVar.getId(), audioItem.getId())) {
                v().K1(aVar);
                Object objF = v().X0().f();
                s.e(objF);
                long jLongValue = ((Number) objF).longValue();
                if (aVar.c() > jLongValue || jLongValue > aVar.c() + aVar.b()) {
                    return;
                }
                v().n0().q(null);
                return;
            }
        }
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.c.a
    public void o(qh.a audioItem) {
        s.h(audioItem, "audioItem");
        w0(audioItem);
        y0(audioItem);
    }

    public final void o0(ng.a audioItem) {
        s.h(audioItem, "audioItem");
        qh.a aVarW = v().W(audioItem);
        w0(aVarW);
        S(aVarW);
        v().n0().q(aVarW);
        x0(aVarW.getId());
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.a, com.hecorat.screenrecorder.free.videoeditor.d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        s.h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getChildFragmentManager().z1("req_audio_single", getViewLifecycleOwner(), new k0() { // from class: oh.a
            @Override // androidx.fragment.app.k0
            public final void a(String str, Bundle bundle) {
                AddAudioFragment.s0(this.f48578a, str, bundle);
            }
        });
        v().X0().j(getViewLifecycleOwner(), new a(new Function1() { // from class: oh.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddAudioFragment.t0(this.f48598a, (Long) obj);
            }
        }));
    }

    public void p0() {
        final com.google.android.material.bottomsheet.a aVar = new com.google.android.material.bottomsheet.a(requireContext());
        aVar.setContentView(R.layout.dialog_audio_volume);
        aVar.show();
        Slider slider = (Slider) aVar.findViewById(R.id.video_volume_slider);
        if (slider != null) {
            slider.setValue(v().S0());
        }
        if (slider != null) {
            slider.m(new com.google.android.material.slider.a() { // from class: oh.d
                @Override // com.google.android.material.slider.a
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final void a(Slider slider2, float f10, boolean z10) {
                    AddAudioFragment.q0(this.f48640a, slider2, f10, z10);
                }
            });
        }
        ImageButton imageButton = (ImageButton) aVar.findViewById(R.id.confirm_btn);
        if (imageButton != null) {
            imageButton.setOnClickListener(new View.OnClickListener() { // from class: oh.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AddAudioFragment.r0(aVar, view);
                }
            });
        }
    }
}

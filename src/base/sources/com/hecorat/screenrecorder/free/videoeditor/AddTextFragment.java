package com.hecorat.screenrecorder.free.videoeditor;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.t0;
import androidx.lifecycle.s1;
import androidx.lifecycle.t1;
import com.hecorat.screenrecorder.free.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import uh.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u0003R\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/hecorat/screenrecorder/free/videoeditor/AddTextFragment;", "Lcom/hecorat/screenrecorder/free/videoeditor/b;", "<init>", "()V", "", "Lqh/k;", "U", "()Ljava/util/List;", "Lfl/g0;", "Y", "Z", "Luh/q0;", "m", "Lfl/k;", "j0", "()Luh/q0;", "textSettingsViewModel", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AddTextFragment extends com.hecorat.screenrecorder.free.videoeditor.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final fl.k textSettingsViewModel = t0.b(this, l0.b(q0.class), new a(this), new b(null, this), new c(this));

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f23205a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f23205a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final t1 invoke() {
            t1 viewModelStore = this.f23205a.requireActivity().getViewModelStore();
            s.g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ tl.a f23206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f23207b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(tl.a aVar, Fragment fragment) {
            super(0);
            this.f23206a = aVar;
            this.f23207b = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final q1.a invoke() {
            q1.a aVar;
            tl.a aVar2 = this.f23206a;
            if (aVar2 != null && (aVar = (q1.a) aVar2.invoke()) != null) {
                return aVar;
            }
            q1.a defaultViewModelCreationExtras = this.f23207b.requireActivity().getDefaultViewModelCreationExtras();
            s.g(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f23208a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f23208a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final s1.c invoke() {
            s1.c defaultViewModelProviderFactory = this.f23208a.requireActivity().getDefaultViewModelProviderFactory();
            s.g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    private final q0 j0() {
        return (q0) this.textSettingsViewModel.getValue();
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.a
    protected List U() {
        List listI1 = v().i1();
        s.f(listI1, "null cannot be cast to non-null type kotlin.collections.MutableList<com.hecorat.screenrecorder.free.videoeditor.data.TimelineItem>");
        return p0.c(listI1);
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.a
    public void Y() {
        j0().B(null);
        androidx.navigation.fragment.a.a(this).F(R.id.action_addTextFragment_to_textSettingsFragment);
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.a
    public void Z() {
        qh.k kVar = (qh.k) v().n0().f();
        if (kVar != null) {
            j0().B((qh.j) kVar);
            androidx.navigation.fragment.a.a(this).F(R.id.action_addTextFragment_to_textSettingsFragment);
        }
    }
}

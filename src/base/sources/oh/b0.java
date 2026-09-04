package oh;

import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J!\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u0004R\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, d2 = {"Loh/b0;", "Loh/o2;", "Ltf/c3;", "<init>", "()V", "Lng/a;", "item", "Lfl/g0;", "L", "(Lng/a;)V", "P", "U", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroid/view/ViewGroup;", "container", "K", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ltf/c3;", "Luh/m0;", "v", "()Luh/m0;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onPause", "onDestroyView", "Landroid/media/MediaPlayer;", "c", "Landroid/media/MediaPlayer;", "mediaPlayer", "Lkf/d;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lkf/d;", "adapter", "e", "Lng/a;", "playingItem", "f", "a", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b0 extends o2<tf.c3> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private MediaPlayer mediaPlayer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private kf.d adapter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private ng.a playingItem;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b implements androidx.lifecycle.q0, kotlin.jvm.internal.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f48603a;

        b(Function1 function) {
            kotlin.jvm.internal.s.h(function, "function");
            this.f48603a = function;
        }

        @Override // kotlin.jvm.internal.m
        public final fl.g a() {
            return this.f48603a;
        }

        @Override // androidx.lifecycle.q0
        public final /* synthetic */ void d(Object obj) {
            this.f48603a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.q0) && (obj instanceof kotlin.jvm.internal.m)) {
                return kotlin.jvm.internal.s.c(a(), ((kotlin.jvm.internal.m) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    private final void L(final ng.a item) {
        if (this.mediaPlayer != null || this.playingItem != null) {
            U();
        }
        final MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).setUsage(1).build());
        try {
            mediaPlayer.setDataSource(requireContext(), item.b());
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: oh.y
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer2) {
                    b0.M(mediaPlayer, this, item, mediaPlayer2);
                }
            });
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: oh.z
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer2) {
                    b0.N(this.f48917a, mediaPlayer2);
                }
            });
            mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: oh.a0
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer2, int i10, int i11) {
                    return b0.O(this.f48579a, mediaPlayer2, i10, i11);
                }
            });
            mediaPlayer.prepareAsync();
        } catch (Throwable unused) {
            U();
        }
        this.mediaPlayer = mediaPlayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(MediaPlayer mediaPlayer, b0 b0Var, ng.a aVar, MediaPlayer mediaPlayer2) {
        mediaPlayer.start();
        kf.d dVar = b0Var.adapter;
        if (dVar == null) {
            kotlin.jvm.internal.s.w("adapter");
            dVar = null;
        }
        dVar.l(aVar);
        b0Var.playingItem = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(b0 b0Var, MediaPlayer mediaPlayer) {
        b0Var.U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean O(b0 b0Var, MediaPlayer mediaPlayer, int i10, int i11) {
        b0Var.U();
        return true;
    }

    private final void P() {
        U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 Q(b0 b0Var, ng.a item) {
        kotlin.jvm.internal.s.h(item, "item");
        b0Var.getParentFragmentManager().y1("req_audio_single", j0.e.a(fl.w.a("audio_single", item)));
        b0Var.dismiss();
        return fl.g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 R(b0 b0Var, ng.a item) {
        kotlin.jvm.internal.s.h(item, "item");
        b0Var.L(item);
        return fl.g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 S(b0 b0Var, ng.a it) {
        kotlin.jvm.internal.s.h(it, "it");
        b0Var.P();
        return fl.g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 T(b0 b0Var, List list) {
        b0Var.U();
        kotlin.jvm.internal.s.e(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ng.a) {
                arrayList.add(obj);
            }
        }
        ((tf.c3) b0Var.w()).D.setVisibility(arrayList.isEmpty() ? 0 : 8);
        ((tf.c3) b0Var.w()).A.setVisibility(arrayList.isEmpty() ? 8 : 0);
        kf.d dVar = b0Var.adapter;
        if (dVar == null) {
            kotlin.jvm.internal.s.w("adapter");
            dVar = null;
        }
        dVar.i(arrayList);
        return fl.g0.f38750a;
    }

    private final void U() {
        ng.a aVar = this.playingItem;
        if (aVar != null) {
            kf.d dVar = this.adapter;
            if (dVar == null) {
                kotlin.jvm.internal.s.w("adapter");
                dVar = null;
            }
            dVar.m(aVar);
        }
        this.playingItem = null;
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.stop();
            } catch (Throwable unused) {
            }
            mediaPlayer.reset();
            mediaPlayer.release();
        }
        this.mediaPlayer = null;
    }

    @Override // oh.o2
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public tf.c3 y(LayoutInflater layoutInflater, ViewGroup container) {
        kotlin.jvm.internal.s.h(layoutInflater, "layoutInflater");
        tf.c3 c3VarY = tf.c3.Y(layoutInflater, container, false);
        kotlin.jvm.internal.s.g(c3VarY, "inflate(...)");
        return c3VarY;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        U();
        ((tf.c3) w()).A.setAdapter(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        U();
    }

    @Override // oh.o2, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (((tf.c3) w()).A.getLayoutManager() == null) {
            ((tf.c3) w()).A.setLayoutManager(new LinearLayoutManager(requireContext()));
        }
        this.adapter = new kf.d(new Function1() { // from class: oh.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b0.Q(this.f48863a, (ng.a) obj);
            }
        }, new Function1() { // from class: oh.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b0.R(this.f48869a, (ng.a) obj);
            }
        }, new Function1() { // from class: oh.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b0.S(this.f48886a, (ng.a) obj);
            }
        });
        RecyclerView recyclerView = ((tf.c3) w()).A;
        kf.d dVar = this.adapter;
        if (dVar == null) {
            kotlin.jvm.internal.s.w("adapter");
            dVar = null;
        }
        recyclerView.setAdapter(dVar);
        x().s().j(getViewLifecycleOwner(), new b(new Function1() { // from class: oh.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b0.T(this.f48899a, (List) obj);
            }
        }));
    }

    @Override // oh.o2
    public uh.m0 v() {
        androidx.lifecycle.s1.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        kotlin.jvm.internal.s.g(defaultViewModelProviderFactory, "<get-defaultViewModelProviderFactory>(...)");
        return (uh.m0) new androidx.lifecycle.s1(this, defaultViewModelProviderFactory).a(uh.a.class);
    }
}

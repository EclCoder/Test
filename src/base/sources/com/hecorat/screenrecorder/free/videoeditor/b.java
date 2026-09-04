package com.hecorat.screenrecorder.free.videoeditor;

import android.os.Bundle;
import android.view.View;
import androidx.activity.d0;
import androidx.activity.i0;
import androidx.lifecycle.b0;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0003¨\u0006\u0010"}, d2 = {"Lcom/hecorat/screenrecorder/free/videoeditor/b;", "Lcom/hecorat/screenrecorder/free/videoeditor/a;", "<init>", "()V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "Lfl/g0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lqh/l;", "item", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "(Lqh/l;)V", "C", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b extends com.hecorat.screenrecorder.free.videoeditor.a {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    public static final class a extends d0 {
        public a() {
            super(true);
        }

        @Override // androidx.activity.d0
        public void d() {
            b.this.v().u1();
            androidx.navigation.fragment.a.a(b.this).L();
        }
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.d
    public void C() {
        v().u1();
        super.C();
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.a, com.hecorat.screenrecorder.free.videoeditor.d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        s.h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        i0 onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        b0 viewLifecycleOwner = getViewLifecycleOwner();
        s.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.g(viewLifecycleOwner, new a());
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.view.VideoElementSeekBar.b
    public void d(qh.l item) {
    }
}

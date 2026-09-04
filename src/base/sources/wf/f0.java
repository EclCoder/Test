package wf;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.ScreenshotActionActivity;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import kotlin.Metadata;
import tf.q2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lwf/f0;", "Lcom/google/android/material/bottomsheet/b;", "Lkf/o;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/g0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Ltg/c;", "shareableApp", CampaignEx.JSON_KEY_AD_R, "(Ltg/c;)V", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "Lkf/s;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lkf/s;", "adapter", "", "c", "Ljava/util/List;", "fullShareableApps", "Landroid/net/Uri;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Landroid/net/Uri;", "uri", "", "e", "Ljava/lang/String;", "mimeType", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f0 extends com.google.android.material.bottomsheet.b implements kf.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private kf.s adapter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private List fullShareableApps;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Uri uri;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private String mimeType;

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        AzRecorderApp.d().G(this);
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(inflater, "inflater");
        kf.s sVar = null;
        androidx.databinding.p pVarH = androidx.databinding.g.h(inflater, R.layout.dialog_share_bottom_sheet, null, false);
        kotlin.jvm.internal.s.g(pVarH, "inflate(...)");
        q2 q2Var = (q2) pVarH;
        if (getArguments() != null) {
            this.uri = (Uri) requireArguments().getParcelable("media_uri");
            this.mimeType = requireArguments().getString("mime_type");
            List listS = nh.e.s(getActivity(), this.mimeType);
            this.fullShareableApps = listS;
            if (listS == null) {
                kotlin.jvm.internal.s.w("fullShareableApps");
                listS = null;
            }
            this.adapter = new kf.s(listS, this);
            q2Var.A.setLayoutManager(new GridLayoutManager(getActivity(), 4));
            RecyclerView recyclerView = q2Var.A;
            kf.s sVar2 = this.adapter;
            if (sVar2 == null) {
                kotlin.jvm.internal.s.w("adapter");
            } else {
                sVar = sVar2;
            }
            recyclerView.setAdapter(sVar);
        }
        return q2Var.B();
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        androidx.fragment.app.s activity;
        kotlin.jvm.internal.s.h(dialog, "dialog");
        super.onDismiss(dialog);
        if (getActivity() == null || !(getActivity() instanceof ScreenshotActionActivity) || (activity = getActivity()) == null) {
            return;
        }
        activity.finish();
    }

    @Override // kf.o
    public void r(tg.c shareableApp) {
        kotlin.jvm.internal.s.h(shareableApp, "shareableApp");
        if (getActivity() == null || this.uri == null || this.mimeType == null) {
            return;
        }
        nh.f0.J(getActivity(), this.uri, this.mimeType, shareableApp);
        dismiss();
    }
}

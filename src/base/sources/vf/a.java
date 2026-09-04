package vf;

import android.content.Context;
import com.hecorat.screenrecorder.free.activities.ExoVideoViewActivity;
import com.hecorat.screenrecorder.free.activities.HomeActivity;
import com.hecorat.screenrecorder.free.activities.ImageViewActivity;
import com.hecorat.screenrecorder.free.activities.MainActivity;
import com.hecorat.screenrecorder.free.activities.NotificationClickActivity;
import com.hecorat.screenrecorder.free.activities.ProjectionWarnFor51Activity;
import com.hecorat.screenrecorder.free.activities.RecordingErrorActivity;
import com.hecorat.screenrecorder.free.activities.RetryProjectionPermissionActivity;
import com.hecorat.screenrecorder.free.activities.ShareEditedFileActivity;
import com.hecorat.screenrecorder.free.activities.ToolboxActivity;
import com.hecorat.screenrecorder.free.activities.UpgradeActivity;
import com.hecorat.screenrecorder.free.activities.VideoRepairActivity;
import com.hecorat.screenrecorder.free.activities.VideoReviewActivity;
import com.hecorat.screenrecorder.free.activities.image_editor.AddStickerActivity;
import com.hecorat.screenrecorder.free.activities.image_editor.AddTextActivity;
import com.hecorat.screenrecorder.free.activities.main_setting_drawer.LanguagesActivity;
import com.hecorat.screenrecorder.free.activities.permission.AskPermissionActivity;
import com.hecorat.screenrecorder.free.feedback.FeedbackActivity;
import com.hecorat.screenrecorder.free.feedback.RateActivity;
import com.hecorat.screenrecorder.free.services.RecordService;
import com.hecorat.screenrecorder.free.ui.permission.ProjectionActivity;
import com.hecorat.screenrecorder.free.videoeditor.CompressFragment;
import com.hecorat.screenrecorder.free.videoeditor.EditVideoActivity;
import com.hecorat.screenrecorder.free.videoeditor.PlayerFragment;
import ig.b1;
import ig.c0;
import ig.m0;
import ig.w0;
import ig.x;
import wf.d0;
import wf.f0;
import wf.h0;
import wf.q;
import wf.z;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public interface a {

    /* JADX INFO: renamed from: vf.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface InterfaceC0838a {
        a create(Context context);
    }

    void A(jg.b bVar);

    void B(LanguagesActivity languagesActivity);

    void C(mf.l lVar);

    hh.a.InterfaceC0608a D();

    void E(c0 c0Var);

    void F(ExoVideoViewActivity exoVideoViewActivity);

    void G(f0 f0Var);

    void H(HomeActivity homeActivity);

    void I(ShareEditedFileActivity shareEditedFileActivity);

    void J(z zVar);

    void K(CompressFragment compressFragment);

    void L(ImageViewActivity imageViewActivity);

    void M(AddStickerActivity addStickerActivity);

    void N(VideoRepairActivity videoRepairActivity);

    void a(RecordingErrorActivity recordingErrorActivity);

    void b(UpgradeActivity upgradeActivity);

    void c(PlayerFragment playerFragment);

    void d(AddTextActivity addTextActivity);

    void e(EditVideoActivity editVideoActivity);

    void f(m0 m0Var);

    kh.a.InterfaceC0658a g();

    void h(d0 d0Var);

    void i(FeedbackActivity feedbackActivity);

    void j(x xVar);

    void k(ProjectionActivity projectionActivity);

    void l(RateActivity rateActivity);

    void m(w0 w0Var);

    void n(q qVar);

    void o(b1 b1Var);

    void p(h0 h0Var);

    void q(com.hecorat.screenrecorder.free.helpers.webserver.a aVar);

    void r(RetryProjectionPermissionActivity retryProjectionPermissionActivity);

    void s(NotificationClickActivity notificationClickActivity);

    void t(VideoReviewActivity videoReviewActivity);

    void u(MainActivity mainActivity);

    void v(ToolboxActivity toolboxActivity);

    void w(AskPermissionActivity askPermissionActivity);

    void x(RecordService recordService);

    void y(ProjectionWarnFor51Activity projectionWarnFor51Activity);

    void z(lf.c cVar);
}

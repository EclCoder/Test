package vf;

import android.app.NotificationManager;
import android.content.Context;
import android.media.projection.MediaProjectionManager;
import com.google.firebase.analytics.FirebaseAnalytics;
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
import com.hecorat.screenrecorder.free.ui.live.facebook.FbDestinationsDialogFragment;
import com.hecorat.screenrecorder.free.ui.live.facebook.LiveFbFragment;
import com.hecorat.screenrecorder.free.ui.live.facebook.settings.FbResolutionDialogFragment;
import com.hecorat.screenrecorder.free.ui.live.facebook.settings.FbSettingsFragment;
import com.hecorat.screenrecorder.free.ui.live.youtube.LiveYtFragment;
import com.hecorat.screenrecorder.free.ui.live.youtube.LoginYtFragment;
import com.hecorat.screenrecorder.free.ui.live.youtube.settings.YtSettingsFragment;
import com.hecorat.screenrecorder.free.ui.permission.ProjectionActivity;
import com.hecorat.screenrecorder.free.videoeditor.CompressFragment;
import com.hecorat.screenrecorder.free.videoeditor.EditVideoActivity;
import com.hecorat.screenrecorder.free.videoeditor.PlayerFragment;
import dg.u;
import dg.v;
import ff.j1;
import ff.o0;
import ff.t0;
import ff.z1;
import ig.b1;
import ig.c0;
import ig.c1;
import ig.m0;
import ig.w0;
import ig.x0;
import java.util.Map;
import lg.x;
import lg.y;
import oh.b3;
import oh.n1;
import oh.y1;
import wf.a0;
import wf.e0;
import wf.h0;
import wf.i0;
import yf.b0;
import yf.d0;
import yf.f0;
import yf.j0;
import yf.r;
import yf.t;
import yf.z;
import zg.q;
import zg.w;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class p {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b implements vf.a {
        private el.a A;
        private el.a B;
        private el.a C;
        private el.a D;
        private el.a E;
        private el.a F;
        private el.a G;
        private el.a H;
        private el.a I;
        private el.a J;
        private el.a K;
        private el.a L;
        private el.a M;
        private el.a N;
        private el.a O;
        private el.a P;
        private el.a Q;
        private el.a R;
        private el.a S;
        private el.a T;
        private el.a U;
        private el.a V;
        private el.a W;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f55440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f55441b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private el.a f55442c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private el.a f55443d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private el.a f55444e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private el.a f55445f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private el.a f55446g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private el.a f55447h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private el.a f55448i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private el.a f55449j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private el.a f55450k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private el.a f55451l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private el.a f55452m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private el.a f55453n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private el.a f55454o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private el.a f55455p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private el.a f55456q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private el.a f55457r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private el.a f55458s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private el.a f55459t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private el.a f55460u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private el.a f55461v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private el.a f55462w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private el.a f55463x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private el.a f55464y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private el.a f55465z;

        private h0 A0(h0 h0Var) {
            i0.b(h0Var, (lg.a) this.f55443d.get());
            i0.a(h0Var, (FirebaseAnalytics) this.f55444e.get());
            return h0Var;
        }

        private w0 B0(w0 w0Var) {
            x0.a(w0Var, (lg.a) this.f55443d.get());
            x0.b(w0Var, (x) this.R.get());
            return w0Var;
        }

        private VideoRepairActivity C0(VideoRepairActivity videoRepairActivity) {
            com.hecorat.screenrecorder.free.activities.k.a(videoRepairActivity, (lg.a) this.f55443d.get());
            return videoRepairActivity;
        }

        private VideoReviewActivity D0(VideoReviewActivity videoReviewActivity) {
            com.hecorat.screenrecorder.free.activities.l.b(videoReviewActivity, (dg.l) this.P.get());
            com.hecorat.screenrecorder.free.activities.l.a(videoReviewActivity, (lg.a) this.f55443d.get());
            com.hecorat.screenrecorder.free.activities.l.c(videoReviewActivity, (x) this.R.get());
            return videoReviewActivity;
        }

        private b1 E0(b1 b1Var) {
            c1.c(b1Var, (qg.d) this.S.get());
            c1.a(b1Var, (qg.a) this.T.get());
            c1.b(b1Var, (lg.a) this.f55443d.get());
            return b1Var;
        }

        private ug.a U() {
            return new ug.a(this.f55440a, (NotificationManager) this.U.get(), (lg.a) this.f55443d.get());
        }

        private void V(vf.b bVar, Context context) {
            ek.c cVarA = ek.d.a(context);
            this.f55442c = cVarA;
            this.f55443d = ek.b.b(lg.b.a(cVarA));
            this.f55444e = ek.b.b(vf.d.a(bVar, this.f55442c));
            this.f55445f = ek.b.b(vf.c.a(bVar, m.a()));
            el.a aVarB = ek.b.b(i.a(bVar, this.f55442c));
            this.f55446g = aVarB;
            this.f55447h = yf.l.a(aVarB, n.a());
            this.f55448i = f0.a(this.f55446g, n.a());
            this.f55449j = yf.j.a(this.f55446g, n.a());
            this.f55450k = d0.a(this.f55446g, n.a());
            this.f55451l = yf.d.a(this.f55446g, n.a());
            this.f55452m = new ek.a();
            this.f55453n = j0.a(this.f55446g, n.a());
            this.f55454o = new ek.a();
            this.f55455p = ek.b.b(j.a(bVar, this.f55442c));
            this.f55456q = cg.b.a(this.f55446g, n.a());
            this.f55457r = yf.h0.a(this.f55446g, n.a());
            this.f55458s = yf.n.a(this.f55446g, n.a());
            this.f55459t = yf.p.a(this.f55446g, n.a());
            ek.a aVar = new ek.a();
            this.f55460u = aVar;
            el.a aVarB2 = ek.b.b(bh.f.a(this.f55457r, this.f55458s, this.f55459t, this.f55454o, aVar, this.f55445f, o.a(), this.f55455p));
            this.f55461v = aVarB2;
            el.a aVarB3 = ek.b.b(w.a(this.f55442c, aVarB2));
            this.f55462w = aVarB3;
            ek.a.a(this.f55460u, ek.b.b(v.a(this.f55455p, this.f55456q, aVarB3, this.f55461v, this.f55445f, o.a())));
            this.f55463x = ek.b.b(eh.d.a(this.f55453n, this.f55445f, this.f55454o, this.f55460u, this.f55455p));
            this.f55464y = ek.b.b(ah.h.a());
            this.f55465z = yf.h.a(this.f55446g, n.a());
            this.A = b0.a(this.f55446g, n.a());
            this.B = yf.f.a(this.f55446g, n.a());
            this.C = z.a(this.f55446g, n.a());
            this.D = ek.b.b(rf.c.a());
            this.E = ek.b.b(rf.e.a());
            this.F = ag.f.a(this.D, n.a());
            this.G = bg.d.a(this.E, n.a());
            this.H = yf.b.a(this.f55446g, n.a());
            this.I = yf.x.a(this.f55446g, n.a());
            this.J = ek.b.b(dg.b.a(this.f55454o, this.D, this.f55445f, o.a()));
            this.K = ek.b.b(vf.e.a(bVar, this.f55442c));
            this.L = ek.b.b(ch.e.a(this.f55445f, this.f55465z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.f55454o, this.f55460u, this.J, o.a(), this.K, this.f55455p));
            this.M = yf.v.a(this.f55446g, n.a());
            this.N = t.a(this.f55446g, n.a());
            r rVarA = r.a(this.f55446g, n.a());
            this.O = rVarA;
            ek.a.a(this.f55454o, ek.b.b(q.a(this.f55452m, this.f55463x, this.f55461v, this.f55464y, this.L, this.f55451l, this.M, this.N, rVarA, this.f55445f, o.a())));
            ek.a aVar2 = new ek.a();
            this.P = aVar2;
            this.Q = ek.b.b(dh.g.a(this.f55455p, this.K, aVar2, this.f55443d));
            this.R = ek.b.b(y.a(this.f55443d));
            ek.a.a(this.P, ek.b.b(dg.m.a(n.a(), this.f55445f, this.f55444e, this.f55443d, this.Q, this.R, this.f55454o)));
            ek.a.a(this.f55452m, ek.b.b(dh.j.a(this.f55445f, this.f55447h, this.f55448i, this.f55449j, this.f55450k, this.f55451l, this.f55454o, this.f55460u, this.P, o.a(), this.K, this.f55444e, this.f55442c, this.f55455p)));
            this.S = ek.b.b(qg.e.a(this.f55443d));
            this.T = ek.b.b(qg.b.a(this.f55443d));
            this.U = ek.b.b(h.a(bVar, this.f55442c));
            this.V = ek.b.b(vf.f.a(bVar, this.f55442c));
            this.W = ek.b.b(vf.g.a(bVar));
        }

        private AddStickerActivity W(AddStickerActivity addStickerActivity) {
            com.hecorat.screenrecorder.free.activities.image_editor.a.a(addStickerActivity, (lg.a) this.f55443d.get());
            return addStickerActivity;
        }

        private AddTextActivity X(AddTextActivity addTextActivity) {
            com.hecorat.screenrecorder.free.activities.image_editor.b.a(addTextActivity, (lg.a) this.f55443d.get());
            return addTextActivity;
        }

        private AskPermissionActivity Y(AskPermissionActivity askPermissionActivity) {
            com.hecorat.screenrecorder.free.activities.permission.a.a(askPermissionActivity, (FirebaseAnalytics) this.f55444e.get());
            com.hecorat.screenrecorder.free.activities.permission.a.b(askPermissionActivity, (lg.a) this.f55443d.get());
            return askPermissionActivity;
        }

        private lf.c Z(lf.c cVar) {
            lf.d.a(cVar, (lg.a) this.f55443d.get());
            return cVar;
        }

        private CompressFragment a0(CompressFragment compressFragment) {
            n1.a(compressFragment, (lg.a) this.f55443d.get());
            return compressFragment;
        }

        private com.hecorat.screenrecorder.free.helpers.webserver.a b0(com.hecorat.screenrecorder.free.helpers.webserver.a aVar) {
            com.hecorat.screenrecorder.free.helpers.webserver.b.a(aVar, (lg.a) this.f55443d.get());
            return aVar;
        }

        private EditVideoActivity c0(EditVideoActivity editVideoActivity) {
            y1.a(editVideoActivity, (lg.a) this.f55443d.get());
            return editVideoActivity;
        }

        private ExoVideoViewActivity d0(ExoVideoViewActivity exoVideoViewActivity) {
            com.hecorat.screenrecorder.free.activities.b.a(exoVideoViewActivity, (FirebaseAnalytics) this.f55444e.get());
            com.hecorat.screenrecorder.free.activities.b.c(exoVideoViewActivity, (lg.a) this.f55443d.get());
            com.hecorat.screenrecorder.free.activities.b.b(exoVideoViewActivity, (zg.p) this.f55454o.get());
            return exoVideoViewActivity;
        }

        private FeedbackActivity e0(FeedbackActivity feedbackActivity) {
            hg.o.a(feedbackActivity, (lg.a) this.f55443d.get());
            return feedbackActivity;
        }

        private jg.b f0(jg.b bVar) {
            jg.c.a(bVar, (lg.a) this.f55443d.get());
            return bVar;
        }

        private HomeActivity g0(HomeActivity homeActivity) {
            com.hecorat.screenrecorder.free.activities.c.c(homeActivity, (lg.a) this.f55443d.get());
            com.hecorat.screenrecorder.free.activities.c.b(homeActivity, (FirebaseAnalytics) this.f55444e.get());
            com.hecorat.screenrecorder.free.activities.c.a(homeActivity, (zg.p) this.f55454o.get());
            com.hecorat.screenrecorder.free.activities.c.d(homeActivity, (dg.l) this.P.get());
            return homeActivity;
        }

        private ImageViewActivity h0(ImageViewActivity imageViewActivity) {
            com.hecorat.screenrecorder.free.activities.g.b(imageViewActivity, (zg.p) this.f55454o.get());
            com.hecorat.screenrecorder.free.activities.g.a(imageViewActivity, (FirebaseAnalytics) this.f55444e.get());
            return imageViewActivity;
        }

        private LanguagesActivity i0(LanguagesActivity languagesActivity) {
            com.hecorat.screenrecorder.free.activities.main_setting_drawer.c.a(languagesActivity, (lg.a) this.f55443d.get());
            return languagesActivity;
        }

        private mf.l j0(mf.l lVar) {
            mf.m.b(lVar, (lg.a) this.f55443d.get());
            mf.m.a(lVar, this.f55440a);
            mf.m.c(lVar, (x) this.R.get());
            return lVar;
        }

        private MainActivity k0(MainActivity mainActivity) {
            ff.h0.e(mainActivity, (lg.a) this.f55443d.get());
            ff.h0.a(mainActivity, (FirebaseAnalytics) this.f55444e.get());
            ff.h0.d(mainActivity, (dh.i) this.f55452m.get());
            ff.h0.c(mainActivity, (dh.f) this.Q.get());
            ff.h0.b(mainActivity, (zg.p) this.f55454o.get());
            return mainActivity;
        }

        private NotificationClickActivity l0(NotificationClickActivity notificationClickActivity) {
            com.hecorat.screenrecorder.free.activities.h.b(notificationClickActivity, ek.b.a(this.P));
            com.hecorat.screenrecorder.free.activities.h.a(notificationClickActivity, ek.b.a(this.J));
            return notificationClickActivity;
        }

        private PlayerFragment m0(PlayerFragment playerFragment) {
            b3.a(playerFragment, (lg.a) this.f55443d.get());
            return playerFragment;
        }

        private ProjectionActivity n0(ProjectionActivity projectionActivity) {
            mh.c.b(projectionActivity, (zg.p) this.f55454o.get());
            mh.c.c(projectionActivity, (MediaProjectionManager) this.V.get());
            mh.c.d(projectionActivity, (lg.a) this.f55443d.get());
            mh.c.a(projectionActivity, (FirebaseAnalytics) this.f55444e.get());
            return projectionActivity;
        }

        private ProjectionWarnFor51Activity o0(ProjectionWarnFor51Activity projectionWarnFor51Activity) {
            com.hecorat.screenrecorder.free.activities.i.a(projectionWarnFor51Activity, (dg.l) this.P.get());
            return projectionWarnFor51Activity;
        }

        private wf.q p0(wf.q qVar) {
            wf.r.a(qVar, (lg.a) this.f55443d.get());
            return qVar;
        }

        private RateActivity q0(RateActivity rateActivity) {
            hg.r.b(rateActivity, (lg.a) this.f55443d.get());
            hg.r.a(rateActivity, (FirebaseAnalytics) this.f55444e.get());
            return rateActivity;
        }

        private RecordService r0(RecordService recordService) {
            xg.c.g(recordService, (qg.d) this.S.get());
            xg.c.c(recordService, (qg.a) this.T.get());
            xg.c.d(recordService, (lg.a) this.f55443d.get());
            xg.c.a(recordService, U());
            xg.c.b(recordService, (zg.p) this.f55454o.get());
            xg.c.f(recordService, ek.b.a(this.f55460u));
            xg.c.e(recordService, ek.b.a(this.P));
            return recordService;
        }

        private RecordingErrorActivity s0(RecordingErrorActivity recordingErrorActivity) {
            o0.a(recordingErrorActivity, (lg.a) this.f55443d.get());
            return recordingErrorActivity;
        }

        private RetryProjectionPermissionActivity t0(RetryProjectionPermissionActivity retryProjectionPermissionActivity) {
            t0.a(retryProjectionPermissionActivity, (dg.l) this.P.get());
            t0.b(retryProjectionPermissionActivity, (u) this.f55460u.get());
            return retryProjectionPermissionActivity;
        }

        private wf.z u0(wf.z zVar) {
            a0.a(zVar, (lg.a) this.f55443d.get());
            return zVar;
        }

        private wf.d0 v0(wf.d0 d0Var) {
            e0.a(d0Var, (lg.a) this.f55443d.get());
            return d0Var;
        }

        private ig.x w0(ig.x xVar) {
            ig.y.d(xVar, (lg.a) this.f55443d.get());
            ig.y.e(xVar, (dh.f) this.Q.get());
            ig.y.g(xVar, (eh.c) this.f55463x.get());
            ig.y.b(xVar, (bh.e) this.f55461v.get());
            ig.y.a(xVar, (ah.g) this.f55464y.get());
            ig.y.f(xVar, (dg.l) this.P.get());
            ig.y.c(xVar, (FirebaseAnalytics) this.f55444e.get());
            return xVar;
        }

        private c0 x0(c0 c0Var) {
            ig.d0.a(c0Var, (lg.a) this.f55443d.get());
            return c0Var;
        }

        private ToolboxActivity y0(ToolboxActivity toolboxActivity) {
            j1.e(toolboxActivity, (lg.a) this.f55443d.get());
            j1.b(toolboxActivity, (bh.e) this.f55461v.get());
            j1.g(toolboxActivity, (eh.c) this.f55463x.get());
            j1.a(toolboxActivity, (ah.g) this.f55464y.get());
            j1.d(toolboxActivity, (dh.f) this.Q.get());
            j1.f(toolboxActivity, (dg.l) this.P.get());
            j1.c(toolboxActivity, (FirebaseAnalytics) this.f55444e.get());
            return toolboxActivity;
        }

        private UpgradeActivity z0(UpgradeActivity upgradeActivity) {
            z1.a(upgradeActivity, (FirebaseAnalytics) this.f55444e.get());
            z1.b(upgradeActivity, (lg.a) this.f55443d.get());
            return upgradeActivity;
        }

        @Override // vf.a
        public void A(jg.b bVar) {
            f0(bVar);
        }

        @Override // vf.a
        public void B(LanguagesActivity languagesActivity) {
            i0(languagesActivity);
        }

        @Override // vf.a
        public void C(mf.l lVar) {
            j0(lVar);
        }

        @Override // vf.a
        public hh.a.InterfaceC0608a D() {
            return new d(this.f55441b);
        }

        @Override // vf.a
        public void E(c0 c0Var) {
            x0(c0Var);
        }

        @Override // vf.a
        public void F(ExoVideoViewActivity exoVideoViewActivity) {
            d0(exoVideoViewActivity);
        }

        @Override // vf.a
        public void H(HomeActivity homeActivity) {
            g0(homeActivity);
        }

        @Override // vf.a
        public void J(wf.z zVar) {
            u0(zVar);
        }

        @Override // vf.a
        public void K(CompressFragment compressFragment) {
            a0(compressFragment);
        }

        @Override // vf.a
        public void L(ImageViewActivity imageViewActivity) {
            h0(imageViewActivity);
        }

        @Override // vf.a
        public void M(AddStickerActivity addStickerActivity) {
            W(addStickerActivity);
        }

        @Override // vf.a
        public void N(VideoRepairActivity videoRepairActivity) {
            C0(videoRepairActivity);
        }

        @Override // vf.a
        public void a(RecordingErrorActivity recordingErrorActivity) {
            s0(recordingErrorActivity);
        }

        @Override // vf.a
        public void b(UpgradeActivity upgradeActivity) {
            z0(upgradeActivity);
        }

        @Override // vf.a
        public void c(PlayerFragment playerFragment) {
            m0(playerFragment);
        }

        @Override // vf.a
        public void d(AddTextActivity addTextActivity) {
            X(addTextActivity);
        }

        @Override // vf.a
        public void e(EditVideoActivity editVideoActivity) {
            c0(editVideoActivity);
        }

        @Override // vf.a
        public kh.a.InterfaceC0658a g() {
            return new f(this.f55441b);
        }

        @Override // vf.a
        public void h(wf.d0 d0Var) {
            v0(d0Var);
        }

        @Override // vf.a
        public void i(FeedbackActivity feedbackActivity) {
            e0(feedbackActivity);
        }

        @Override // vf.a
        public void j(ig.x xVar) {
            w0(xVar);
        }

        @Override // vf.a
        public void k(ProjectionActivity projectionActivity) {
            n0(projectionActivity);
        }

        @Override // vf.a
        public void l(RateActivity rateActivity) {
            q0(rateActivity);
        }

        @Override // vf.a
        public void m(w0 w0Var) {
            B0(w0Var);
        }

        @Override // vf.a
        public void n(wf.q qVar) {
            p0(qVar);
        }

        @Override // vf.a
        public void o(b1 b1Var) {
            E0(b1Var);
        }

        @Override // vf.a
        public void p(h0 h0Var) {
            A0(h0Var);
        }

        @Override // vf.a
        public void q(com.hecorat.screenrecorder.free.helpers.webserver.a aVar) {
            b0(aVar);
        }

        @Override // vf.a
        public void r(RetryProjectionPermissionActivity retryProjectionPermissionActivity) {
            t0(retryProjectionPermissionActivity);
        }

        @Override // vf.a
        public void s(NotificationClickActivity notificationClickActivity) {
            l0(notificationClickActivity);
        }

        @Override // vf.a
        public void t(VideoReviewActivity videoReviewActivity) {
            D0(videoReviewActivity);
        }

        @Override // vf.a
        public void u(MainActivity mainActivity) {
            k0(mainActivity);
        }

        @Override // vf.a
        public void v(ToolboxActivity toolboxActivity) {
            y0(toolboxActivity);
        }

        @Override // vf.a
        public void w(AskPermissionActivity askPermissionActivity) {
            Y(askPermissionActivity);
        }

        @Override // vf.a
        public void x(RecordService recordService) {
            r0(recordService);
        }

        @Override // vf.a
        public void y(ProjectionWarnFor51Activity projectionWarnFor51Activity) {
            o0(projectionWarnFor51Activity);
        }

        @Override // vf.a
        public void z(lf.c cVar) {
            Z(cVar);
        }

        private b(vf.b bVar, Context context) {
            this.f55441b = this;
            this.f55440a = context;
            V(bVar, context);
        }

        @Override // vf.a
        public void G(wf.f0 f0Var) {
        }

        @Override // vf.a
        public void I(ShareEditedFileActivity shareEditedFileActivity) {
        }

        @Override // vf.a
        public void f(m0 m0Var) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c implements vf.a.InterfaceC0838a {
        private c() {
        }

        @Override // vf.a.InterfaceC0838a
        public vf.a create(Context context) {
            ek.e.a(context);
            return new b(new vf.b(), context);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d implements hh.a.InterfaceC0608a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f55466a;

        @Override // hh.a.InterfaceC0608a
        public hh.a a() {
            return new e(this.f55466a);
        }

        private d(b bVar) {
            this.f55466a = bVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class e implements hh.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f55467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e f55468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private el.a f55469c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private el.a f55470d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private el.a f55471e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private el.a f55472f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private el.a f55473g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private el.a f55474h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private el.a f55475i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private el.a f55476j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private el.a f55477k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private el.a f55478l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private el.a f55479m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private el.a f55480n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private el.a f55481o;

        private k e() {
            return new k(k());
        }

        private void f() {
            this.f55469c = ag.d.a(this.f55467a.D, n.a());
            this.f55470d = ag.h.a(this.f55467a.f55446g, this.f55467a.W, n.a());
            this.f55471e = ag.r.a(this.f55467a.f55446g, this.f55467a.W, n.a());
            this.f55472f = ag.j.a(this.f55467a.f55446g, this.f55467a.W, n.a());
            this.f55473g = ag.n.a(this.f55467a.D, n.a());
            this.f55474h = ag.b.a(n.a());
            this.f55475i = ag.l.a(this.f55467a.f55446g, n.a());
            ag.v vVarA = ag.v.a(this.f55467a.f55446g, n.a());
            this.f55476j = vVarA;
            this.f55477k = gh.p.a(this.f55469c, this.f55470d, this.f55471e, this.f55472f, this.f55473g, this.f55474h, this.f55475i, vVarA, this.f55467a.J, this.f55467a.D);
            this.f55478l = ag.t.a(this.f55467a.f55446g, this.f55467a.W, n.a());
            this.f55479m = xf.b.a(n.a());
            this.f55480n = ag.p.a(this.f55467a.D, n.a());
            this.f55481o = ih.g.a(this.f55472f, this.f55478l, this.f55479m, this.f55467a.D, this.f55480n);
        }

        private FbDestinationsDialogFragment g(FbDestinationsDialogFragment fbDestinationsDialogFragment) {
            gh.i.a(fbDestinationsDialogFragment, e());
            return fbDestinationsDialogFragment;
        }

        private FbResolutionDialogFragment h(FbResolutionDialogFragment fbResolutionDialogFragment) {
            ih.c.a(fbResolutionDialogFragment, e());
            return fbResolutionDialogFragment;
        }

        private FbSettingsFragment i(FbSettingsFragment fbSettingsFragment) {
            com.hecorat.screenrecorder.free.ui.live.facebook.settings.a.a(fbSettingsFragment, e());
            return fbSettingsFragment;
        }

        private LiveFbFragment j(LiveFbFragment liveFbFragment) {
            gh.n.a(liveFbFragment, e());
            return liveFbFragment;
        }

        private Map k() {
            return com.google.common.collect.e0.s(gh.o.class, this.f55477k, ih.f.class, this.f55481o);
        }

        @Override // hh.a
        public void a(FbDestinationsDialogFragment fbDestinationsDialogFragment) {
            g(fbDestinationsDialogFragment);
        }

        @Override // hh.a
        public void b(FbSettingsFragment fbSettingsFragment) {
            i(fbSettingsFragment);
        }

        @Override // hh.a
        public void c(FbResolutionDialogFragment fbResolutionDialogFragment) {
            h(fbResolutionDialogFragment);
        }

        @Override // hh.a
        public void d(LiveFbFragment liveFbFragment) {
            j(liveFbFragment);
        }

        private e(b bVar) {
            this.f55468b = this;
            this.f55467a = bVar;
            f();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class f implements kh.a.InterfaceC0658a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f55482a;

        @Override // kh.a.InterfaceC0658a
        public kh.a a() {
            return new g(this.f55482a);
        }

        private f(b bVar) {
            this.f55482a = bVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class g implements kh.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f55483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g f55484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private el.a f55485c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private el.a f55486d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private el.a f55487e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private el.a f55488f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private el.a f55489g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private el.a f55490h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private el.a f55491i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private el.a f55492j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private el.a f55493k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private el.a f55494l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private el.a f55495m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private el.a f55496n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private el.a f55497o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private el.a f55498p;

        private k e() {
            return new k(l());
        }

        private bg.a f() {
            return new bg.a((sf.e) this.f55483a.f55446g.get(), n.c());
        }

        private void g() {
            this.f55485c = bg.b.a(this.f55483a.f55446g, n.a());
            this.f55486d = bg.n.a(this.f55483a.E, n.a());
            this.f55487e = bg.f.a(this.f55483a.f55446g, n.a());
            this.f55488f = bg.l.a(this.f55483a.f55446g, n.a());
            this.f55489g = bg.j.a(this.f55483a.f55446g, n.a());
            this.f55490h = bg.r.a(this.f55483a.f55446g, n.a());
            this.f55491i = bg.x.a(this.f55483a.f55446g, n.a());
            this.f55492j = bg.v.a(this.f55483a.f55446g, n.a());
            bg.h hVarA = bg.h.a(this.f55483a.f55446g, this.f55483a.W, n.a());
            this.f55493k = hVarA;
            this.f55494l = jh.l.a(this.f55485c, this.f55486d, this.f55487e, this.f55488f, this.f55489g, this.f55490h, this.f55491i, this.f55492j, hVarA, n.a(), this.f55483a.J, this.f55483a.E);
            this.f55495m = bg.t.a(this.f55483a.f55446g, this.f55483a.W, n.a());
            this.f55496n = bg.p.a(this.f55483a.f55446g, n.a());
            this.f55497o = xf.b.a(n.a());
            this.f55498p = lh.h.a(this.f55493k, this.f55495m, this.f55496n, this.f55483a.E, this.f55497o);
        }

        private LiveYtFragment h(LiveYtFragment liveYtFragment) {
            jh.g.a(liveYtFragment, e());
            return liveYtFragment;
        }

        private LoginYtFragment i(LoginYtFragment loginYtFragment) {
            jh.o.c(loginYtFragment, (lg.a) this.f55483a.f55443d.get());
            jh.o.b(loginYtFragment, (rf.d) this.f55483a.E.get());
            jh.o.a(loginYtFragment, f());
            jh.o.d(loginYtFragment, m());
            return loginYtFragment;
        }

        private lh.c j(lh.c cVar) {
            lh.d.a(cVar, e());
            return cVar;
        }

        private YtSettingsFragment k(YtSettingsFragment ytSettingsFragment) {
            com.hecorat.screenrecorder.free.ui.live.youtube.settings.a.a(ytSettingsFragment, e());
            return ytSettingsFragment;
        }

        private Map l() {
            return com.google.common.collect.e0.s(jh.j.class, this.f55494l, lh.g.class, this.f55498p);
        }

        private bg.o m() {
            return new bg.o((sf.e) this.f55483a.f55446g.get(), n.c());
        }

        @Override // kh.a
        public void a(lh.c cVar) {
            j(cVar);
        }

        @Override // kh.a
        public void b(YtSettingsFragment ytSettingsFragment) {
            k(ytSettingsFragment);
        }

        @Override // kh.a
        public void c(LiveYtFragment liveYtFragment) {
            h(liveYtFragment);
        }

        @Override // kh.a
        public void d(LoginYtFragment loginYtFragment) {
            i(loginYtFragment);
        }

        private g(b bVar) {
            this.f55484b = this;
            this.f55483a = bVar;
            g();
        }
    }

    public static vf.a.InterfaceC0838a a() {
        return new c();
    }
}

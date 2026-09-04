package wf;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Outline;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.UpgradeActivity;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o0;
import nh.l0;
import nl.dionsegijn.konfetti.xml.KonfettiView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 32\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u0003J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010!R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00064"}, d2 = {"Lwf/q;", "Landroidx/fragment/app/m;", "<init>", "()V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lfl/g0;", "A", "(Landroid/view/View;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onResume", "Landroid/content/DialogInterface;", "dialog", "onCancel", "(Landroid/content/DialogInterface;)V", "onDismiss", "", "a", "Ljava/lang/String;", "productId", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "formattedPrice", "c", "discount", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "J", "timeLeft", "Llg/a;", "e", "Llg/a;", "w", "()Llg/a;", "setPreferenceManager", "(Llg/a;)V", "preferenceManager", "f", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q extends androidx.fragment.app.m {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String productId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String formattedPrice;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String discount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long timeLeft;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public lg.a preferenceManager;

    /* JADX INFO: renamed from: wf.q$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final q a(String productId, String price, String discount, long j10) {
            kotlin.jvm.internal.s.h(productId, "productId");
            kotlin.jvm.internal.s.h(price, "price");
            kotlin.jvm.internal.s.h(discount, "discount");
            q qVar = new q();
            Bundle bundle = new Bundle();
            bundle.putString("arg_product_id", productId);
            bundle.putString("arg_price", price);
            bundle.putString("arg_discount", discount);
            bundle.putLong("arg_time_left", j10);
            qVar.setArguments(bundle);
            return qVar;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            kotlin.jvm.internal.s.h(view, "view");
            kotlin.jvm.internal.s.h(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), q.this.getResources().getDimensionPixelSize(R.dimen.corner_radius_cta_button) * 1.0f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f56251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f56252b;

        c(View view, View view2) {
            this.f56251a = view;
            this.f56252b = view2;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f56251a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            float width = this.f56251a.getWidth();
            float width2 = this.f56252b.getWidth();
            if (width <= 0.0f || width2 <= 0.0f) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f56251a, "translationX", (-2) * width, width2 + (2 * width));
            objectAnimatorOfFloat.setDuration(2000L);
            objectAnimatorOfFloat.setRepeatCount(-1);
            objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            objectAnimatorOfFloat.start();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d extends CountDownTimer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f56253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f56254b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextView f56255c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f56256d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ q f56257e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(TextView textView, TextView textView2, TextView textView3, TextView textView4, q qVar, long j10) {
            super(j10, 100L);
            this.f56253a = textView;
            this.f56254b = textView2;
            this.f56255c = textView3;
            this.f56256d = textView4;
            this.f56257e = qVar;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.f56257e.dismiss();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            long j11 = 3600000;
            long j12 = j10 / j11;
            long j13 = 60000;
            long j14 = (j10 % j11) / j13;
            long j15 = 1000;
            long j16 = (j10 % j13) / j15;
            long j17 = (j10 % j15) / ((long) 100);
            TextView textView = this.f56253a;
            o0 o0Var = o0.f43602a;
            String str = String.format(l0.e(), "%02d", Arrays.copyOf(new Object[]{Long.valueOf(j12)}, 1));
            kotlin.jvm.internal.s.g(str, "format(...)");
            textView.setText(str);
            TextView textView2 = this.f56254b;
            String str2 = String.format(l0.e(), "%02d", Arrays.copyOf(new Object[]{Long.valueOf(j14)}, 1));
            kotlin.jvm.internal.s.g(str2, "format(...)");
            textView2.setText(str2);
            TextView textView3 = this.f56255c;
            String str3 = String.format(l0.e(), "%02d", Arrays.copyOf(new Object[]{Long.valueOf(j16)}, 1));
            kotlin.jvm.internal.s.g(str3, "format(...)");
            textView3.setText(str3);
            TextView textView4 = this.f56256d;
            String str4 = String.format(l0.e(), "%d", Arrays.copyOf(new Object[]{Long.valueOf(j17)}, 1));
            kotlin.jvm.internal.s.g(str4, "format(...)");
            textView4.setText(str4);
        }
    }

    private final void A(View view) {
        new d((TextView) view.findViewById(R.id.tvHour), (TextView) view.findViewById(R.id.tvMinute), (TextView) view.findViewById(R.id.tvSecond), (TextView) view.findViewById(R.id.tvDeciSecond), this, (this.timeLeft / ((long) 1000)) * 1000).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(q qVar, View view) {
        androidx.fragment.app.s activity = qVar.getActivity();
        UpgradeActivity upgradeActivity = activity instanceof UpgradeActivity ? (UpgradeActivity) activity : null;
        if (upgradeActivity != null) {
            upgradeActivity.X0("promo_dismissed", qVar.productId);
        }
        qVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(q qVar, final View view, View view2) {
        UpgradeActivity upgradeActivity;
        String str;
        UpgradeActivity upgradeActivity2;
        androidx.fragment.app.s activity = qVar.getActivity();
        if (activity instanceof UpgradeActivity) {
            upgradeActivity2 = (UpgradeActivity) activity;
        } else {
            upgradeActivity = null;
        }
        if (upgradeActivity == null || (str = qVar.productId) == null || !upgradeActivity.R0()) {
            upgradeActivity = upgradeActivity2;
            return;
        }
        upgradeActivity = upgradeActivity2;
        view.setEnabled(false);
        upgradeActivity.X0("promo_buy_click", str);
        upgradeActivity.O0(upgradeActivity, str, new Function1() { // from class: wf.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.z(view, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 z(View view, boolean z10) {
        if (!z10) {
            view.setEnabled(true);
        }
        return fl.g0.f38750a;
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        kotlin.jvm.internal.s.h(dialog, "dialog");
        super.onCancel(dialog);
        androidx.fragment.app.s activity = getActivity();
        UpgradeActivity upgradeActivity = activity instanceof UpgradeActivity ? (UpgradeActivity) activity : null;
        if (upgradeActivity != null) {
            upgradeActivity.X0("promo_dismissed", this.productId);
        }
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        AzRecorderApp.d().n(this);
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.productId = arguments.getString("arg_product_id");
            this.formattedPrice = arguments.getString("arg_price");
            this.discount = arguments.getString("arg_discount");
            this.timeLeft = arguments.getLong("arg_time_left");
        }
    }

    @Override // androidx.fragment.app.m
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        WindowManager.LayoutParams attributes;
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        kotlin.jvm.internal.s.g(dialogOnCreateDialog, "onCreateDialog(...)");
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null && (attributes = window.getAttributes()) != null) {
            attributes.windowAnimations = R.style.DialogAnimation;
        }
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Window window;
        kotlin.jvm.internal.s.h(inflater, "inflater");
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        return inflater.inflate(R.layout.dialog_promo, container, false);
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        kotlin.jvm.internal.s.h(dialog, "dialog");
        super.onDismiss(dialog);
        androidx.fragment.app.s activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        View viewFindViewById;
        super.onResume();
        View view = getView();
        if (view == null || (viewFindViewById = view.findViewById(R.id.layoutCTA)) == null) {
            return;
        }
        viewFindViewById.setEnabled(true);
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setLayout(-1, -1);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null) {
            return;
        }
        l0.f47742a.C(window);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ((TextView) view.findViewById(R.id.tvDiscount)).setText(this.discount);
        ((TextView) view.findViewById(R.id.tvPrice)).setText(this.formattedPrice);
        ((ImageView) view.findViewById(R.id.btnClose)).setOnClickListener(new View.OnClickListener() { // from class: wf.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                q.x(this.f56240a, view2);
            }
        });
        final View viewFindViewById = view.findViewById(R.id.layoutCTA);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: wf.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                q.y(this.f56241a, viewFindViewById, view2);
            }
        });
        view.findViewById(R.id.shimmerContainer).setClipToOutline(true);
        view.setOutlineProvider(new b());
        View viewFindViewById2 = view.findViewById(R.id.shimmer);
        viewFindViewById2.getViewTreeObserver().addOnGlobalLayoutListener(new c(viewFindViewById2, viewFindViewById));
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view.findViewById(R.id.tagExclusiveOffer), PropertyValuesHolder.ofFloat("scaleX", 1.0f, 1.05f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 1.05f, 1.0f));
        objectAnimatorOfPropertyValuesHolder.setDuration(2000L);
        objectAnimatorOfPropertyValuesHolder.setRepeatCount(1);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfPropertyValuesHolder.setStartDelay(1000L);
        objectAnimatorOfPropertyValuesHolder.start();
        A(view);
        if (w().b(R.string.pref_has_shown_promo_dialog, false)) {
            return;
        }
        ((KonfettiView) view.findViewById(R.id.konfettiView)).b(lg.e.f44506a.a());
        w().j(R.string.pref_has_shown_promo_dialog, true);
    }

    public final lg.a w() {
        lg.a aVar = this.preferenceManager;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.s.w("preferenceManager");
        return null;
    }
}

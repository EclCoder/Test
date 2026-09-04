package com.facebook.login.widget;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.h0;
import com.facebook.internal.a0;
import com.facebook.internal.e1;
import com.facebook.internal.w;
import com.facebook.login.f0;
import com.facebook.login.i0;
import com.facebook.login.r0;
import com.facebook.login.t0;
import com.facebook.login.v;
import com.facebook.m;
import com.facebook.r;
import com.facebook.s0;
import com.facebook.t;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.dycreator.binding.vREM.mTFeqtajA;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import fl.k;
import fl.l;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 \u001b2\u00020\u0001:\u0007Ã\u0001Ä\u00019Å\u0001B;\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\tH\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 J'\u0010\u001f\u001a\u00020\u00122\u0016\u0010\u001e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0!\"\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u001f\u0010\"J%\u0010#\u001a\u00020\u00122\u0016\u0010\u001e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0!\"\u0004\u0018\u00010\t¢\u0006\u0004\b#\u0010\"J\u001d\u0010$\u001a\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001dH\u0007¢\u0006\u0004\b$\u0010 J'\u0010$\u001a\u00020\u00122\u0016\u0010\u001e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0!\"\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b$\u0010\"J\r\u0010%\u001a\u00020\u0012¢\u0006\u0004\b%\u0010\u0019J\u000f\u0010&\u001a\u00020\u0012H\u0015¢\u0006\u0004\b&\u0010\u0019J\u0017\u0010)\u001a\u00020\u00122\u0006\u0010(\u001a\u00020'H\u0015¢\u0006\u0004\b)\u0010*J7\u00101\u001a\u00020\u00122\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u0006H\u0015¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0012H\u0015¢\u0006\u0004\b3\u0010\u0019J\u001f\u00107\u001a\u00020\u00122\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\u0006H\u0015¢\u0006\u0004\b7\u00108J1\u00109\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0015¢\u0006\u0004\b9\u0010:J1\u0010;\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0005¢\u0006\u0004\b;\u0010:J\u001f\u0010>\u001a\u00020\u00122\u0006\u0010<\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u0006H\u0015¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u0006H\u0005¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0012H\u0005¢\u0006\u0004\bB\u0010\u0019J\u000f\u0010C\u001a\u00020\u0012H\u0005¢\u0006\u0004\bC\u0010\u0019J\u000f\u0010D\u001a\u00020\u0012H\u0005¢\u0006\u0004\bD\u0010\u0019J\u000f\u0010E\u001a\u00020\u0012H\u0005¢\u0006\u0004\bE\u0010\u0019R\u0016\u0010H\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR.\u0010O\u001a\u0004\u0018\u00010\t2\b\u0010I\u001a\u0004\u0018\u00010\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010\u0017R.\u0010S\u001a\u0004\u0018\u00010\t2\b\u0010I\u001a\u0004\u0018\u00010\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010K\u001a\u0004\bQ\u0010M\"\u0004\bR\u0010\u0017R\u001a\u0010Y\u001a\u00020T8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u0016\u0010[\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010GR\"\u0010c\u001a\u00020\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010k\u001a\u00020d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u0010s\u001a\u00020l8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\u0018\u0010w\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0018\u0010{\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR,\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020}0|8\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0004\b\u0018\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001c\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u008a\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0019\u0010\u008c\u0001\u001a\u00020\t8\u0006¢\u0006\r\n\u0004\b%\u0010K\u001a\u0005\b\u008b\u0001\u0010MR/\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008d\u00012\n\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008d\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b\u0016\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R(\u0010\u0096\u0001\u001a\u0012\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\t0\u0094\u0001\u0018\u00010\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b@\u0010\u0095\u0001R+\u0010\u009c\u0001\u001a\u00030\u0097\u00012\u0007\u0010I\u001a\u00030\u0097\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R+\u0010¢\u0001\u001a\u00030\u009d\u00012\u0007\u0010I\u001a\u00030\u009d\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R+\u0010¨\u0001\u001a\u00030£\u00012\u0007\u0010I\u001a\u00030£\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R'\u0010«\u0001\u001a\u00020\t2\u0006\u0010I\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b©\u0001\u0010M\"\u0005\bª\u0001\u0010\u0017R+\u0010®\u0001\u001a\u0004\u0018\u00010\t2\b\u0010I\u001a\u0004\u0018\u00010\t8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b¬\u0001\u0010M\"\u0005\b\u00ad\u0001\u0010\u0017R)\u0010³\u0001\u001a\u00020+2\u0006\u0010I\u001a\u00020+8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R\u0014\u0010µ\u0001\u001a\u00020+8F¢\u0006\b\u001a\u0006\b´\u0001\u0010°\u0001R\u0017\u0010¸\u0001\u001a\u00020\u00068EX\u0084\u0004¢\u0006\b\u001a\u0006\b¶\u0001\u0010·\u0001R2\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001d2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\t0\u001d8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0004\b#\u0010 R\u001c\u0010¾\u0001\u001a\u00070»\u0001R\u00020\u00008TX\u0094\u0004¢\u0006\b\u001a\u0006\b¼\u0001\u0010½\u0001R\u0017\u0010À\u0001\u001a\u00020\u00068TX\u0094\u0004¢\u0006\b\u001a\u0006\b¿\u0001\u0010·\u0001R\u0017\u0010Â\u0001\u001a\u00020\u00068UX\u0094\u0004¢\u0006\b\u001a\u0006\bÁ\u0001\u0010·\u0001¨\u0006Æ\u0001"}, d2 = {"Lcom/facebook/login/widget/LoginButton;", "Lcom/facebook/t;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "", "analyticsButtonCreatedEventName", "analyticsButtonTappedEventName", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILjava/lang/String;Ljava/lang/String;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/facebook/internal/w;", "settings", "Lfl/g0;", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "(Lcom/facebook/internal/w;)V", "toolTipString", "x", "(Ljava/lang/String;)V", "t", "()V", "text", "z", "(Ljava/lang/String;)I", "", "permissions", "setReadPermissions", "(Ljava/util/List;)V", "", "([Ljava/lang/String;)V", "setPermissions", "setPublishPermissions", "w", "onAttachedToWindow", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "", "changed", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "onLayout", "(ZIIII)V", "onDetachedFromWindow", "Landroid/view/View;", "changedView", "visibility", "onVisibilityChanged", "(Landroid/view/View;I)V", "c", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "B", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "y", "(I)I", "E", "C", "D", "F", "j", "Z", "confirmLogout", AppMeasurementSdk.ConditionalUserProperty.VALUE, CampaignEx.JSON_KEY_AD_K, "Ljava/lang/String;", "getLoginText", "()Ljava/lang/String;", "setLoginText", "loginText", "l", "getLogoutText", "setLogoutText", "logoutText", "Lcom/facebook/login/widget/LoginButton$b;", "m", "Lcom/facebook/login/widget/LoginButton$b;", "getProperties", "()Lcom/facebook/login/widget/LoginButton$b;", "properties", "n", "toolTipChecked", "Lcom/facebook/login/widget/i$c;", "o", "Lcom/facebook/login/widget/i$c;", "getToolTipStyle", "()Lcom/facebook/login/widget/i$c;", "setToolTipStyle", "(Lcom/facebook/login/widget/i$c;)V", "toolTipStyle", "Lcom/facebook/login/widget/LoginButton$d;", TtmlNode.TAG_P, "Lcom/facebook/login/widget/LoginButton$d;", "getToolTipMode", "()Lcom/facebook/login/widget/LoginButton$d;", "setToolTipMode", "(Lcom/facebook/login/widget/LoginButton$d;)V", "toolTipMode", "", CampaignEx.JSON_KEY_AD_Q, "J", "getToolTipDisplayTime", "()J", "setToolTipDisplayTime", "(J)V", "toolTipDisplayTime", "Lcom/facebook/login/widget/i;", CampaignEx.JSON_KEY_AD_R, "Lcom/facebook/login/widget/i;", "toolTipPopup", "Lcom/facebook/m;", "s", "Lcom/facebook/m;", "accessTokenTracker", "Lfl/k;", "Lcom/facebook/login/f0;", "Lfl/k;", "getLoginManagerLazy", "()Lfl/k;", "setLoginManagerLazy", "(Lfl/k;)V", "loginManagerLazy", "", "u", "Ljava/lang/Float;", "customButtonRadius", "v", "I", "customButtonTransparency", "getLoggerID", "loggerID", "Lcom/facebook/r;", "<set-?>", "Lcom/facebook/r;", "getCallbackManager", "()Lcom/facebook/r;", "callbackManager", "Lf/c;", "", "Lf/c;", "androidXLoginCaller", "Lcom/facebook/login/e;", "getDefaultAudience", "()Lcom/facebook/login/e;", "setDefaultAudience", "(Lcom/facebook/login/e;)V", "defaultAudience", "Lcom/facebook/login/v;", "getLoginBehavior", "()Lcom/facebook/login/v;", "setLoginBehavior", "(Lcom/facebook/login/v;)V", "loginBehavior", "Lcom/facebook/login/i0;", "getLoginTargetApp", "()Lcom/facebook/login/i0;", "setLoginTargetApp", "(Lcom/facebook/login/i0;)V", "loginTargetApp", "getAuthType", "setAuthType", "authType", "getMessengerPageId", "setMessengerPageId", "messengerPageId", "getResetMessengerState", "()Z", "setResetMessengerState", "(Z)V", "resetMessengerState", "getShouldSkipAccountDeduplication", "shouldSkipAccountDeduplication", "getLoginButtonContinueLabel", "()I", "loginButtonContinueLabel", "getPermissions", "()Ljava/util/List;", "Lcom/facebook/login/widget/LoginButton$c;", "getNewLoginClickListener", "()Lcom/facebook/login/widget/LoginButton$c;", "newLoginClickListener", "getDefaultStyleResource", "defaultStyleResource", "getDefaultRequestCode", "defaultRequestCode", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "facebook-login_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class LoginButton extends t {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean confirmLogout;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private String loginText;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private String logoutText;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final b properties;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean toolTipChecked;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private i.c toolTipStyle;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private d toolTipMode;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private long toolTipDisplayTime;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private i toolTipPopup;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private m accessTokenTracker;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private k loginManagerLazy;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private Float customButtonRadius;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int customButtonTransparency;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final String loggerID;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private r callbackManager;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private f.c androidXLoginCaller;
    private static final String A = LoginButton.class.getName();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.facebook.login.e f15854a = com.facebook.login.e.FRIENDS;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f15855b = gl.r.l();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private v f15856c = v.NATIVE_WITH_FALLBACK;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f15857d = "rerequest";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private i0 f15858e = i0.FACEBOOK;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f15859f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f15860g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f15861h;

        public final String a() {
            return this.f15857d;
        }

        public final com.facebook.login.e b() {
            return this.f15854a;
        }

        public final v c() {
            return this.f15856c;
        }

        public final i0 d() {
            return this.f15858e;
        }

        public final String e() {
            return this.f15860g;
        }

        public final List f() {
            return this.f15855b;
        }

        public final boolean g() {
            return this.f15861h;
        }

        public final boolean h() {
            return this.f15859f;
        }

        public final void i(String str) {
            s.h(str, "<set-?>");
            this.f15857d = str;
        }

        public final void j(com.facebook.login.e eVar) {
            s.h(eVar, "<set-?>");
            this.f15854a = eVar;
        }

        public final void k(v vVar) {
            s.h(vVar, "<set-?>");
            this.f15856c = vVar;
        }

        public final void l(i0 i0Var) {
            s.h(i0Var, "<set-?>");
            this.f15858e = i0Var;
        }

        public final void m(String str) {
            this.f15860g = str;
        }

        public final void n(List list) {
            s.h(list, "<set-?>");
            this.f15855b = list;
        }

        public final void o(boolean z10) {
            this.f15861h = z10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    protected class c implements View.OnClickListener {
        public c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(f0 loginManager, DialogInterface dialogInterface, int i10) {
            if (x7.a.c(c.class)) {
                return;
            }
            try {
                s.h(loginManager, "$loginManager");
                loginManager.u();
            } catch (Throwable th2) {
                x7.a.b(th2, c.class);
            }
        }

        protected f0 b() {
            if (x7.a.c(this)) {
                return null;
            }
            try {
                f0 f0VarC = f0.f15590j.c();
                f0VarC.D(LoginButton.this.getDefaultAudience());
                f0VarC.G(LoginButton.this.getLoginBehavior());
                f0VarC.H(c());
                f0VarC.C(LoginButton.this.getAuthType());
                f0VarC.F(d());
                f0VarC.K(LoginButton.this.getShouldSkipAccountDeduplication());
                f0VarC.I(LoginButton.this.getMessengerPageId());
                f0VarC.J(LoginButton.this.getResetMessengerState());
                return f0VarC;
            } catch (Throwable th2) {
                x7.a.b(th2, this);
                return null;
            }
        }

        protected final i0 c() {
            if (x7.a.c(this)) {
                return null;
            }
            try {
                return i0.FACEBOOK;
            } catch (Throwable th2) {
                x7.a.b(th2, this);
                return null;
            }
        }

        protected final boolean d() {
            x7.a.c(this);
            return false;
        }

        protected final void e() {
            if (x7.a.c(this)) {
                return;
            }
            try {
                f0 f0VarB = b();
                f.c cVar = LoginButton.this.androidXLoginCaller;
                if (cVar != null) {
                    g.a aVarA = cVar.a();
                    s.f(aVarA, "null cannot be cast to non-null type com.facebook.login.LoginManager.FacebookLoginActivityResultContract");
                    f0.c cVar2 = (f0.c) aVarA;
                    r callbackManager = LoginButton.this.getCallbackManager();
                    if (callbackManager == null) {
                        callbackManager = new com.facebook.internal.e();
                    }
                    cVar2.f(callbackManager);
                    cVar.b(LoginButton.this.getProperties().f());
                    return;
                }
                if (LoginButton.this.getFragment() != null) {
                    Fragment fragment = LoginButton.this.getFragment();
                    if (fragment != null) {
                        LoginButton loginButton = LoginButton.this;
                        f0VarB.p(fragment, loginButton.getProperties().f(), loginButton.getLoggerID());
                        return;
                    }
                    return;
                }
                if (LoginButton.this.getNativeFragment() == null) {
                    f0VarB.n(LoginButton.this.getActivity(), LoginButton.this.getProperties().f(), LoginButton.this.getLoggerID());
                    return;
                }
                android.app.Fragment nativeFragment = LoginButton.this.getNativeFragment();
                if (nativeFragment != null) {
                    LoginButton loginButton2 = LoginButton.this;
                    f0VarB.o(nativeFragment, loginButton2.getProperties().f(), loginButton2.getLoggerID());
                }
            } catch (Throwable th2) {
                x7.a.b(th2, this);
            }
        }

        protected final void f(Context context) {
            String string;
            if (x7.a.c(this)) {
                return;
            }
            try {
                s.h(context, "context");
                final f0 f0VarB = b();
                if (!LoginButton.this.confirmLogout) {
                    f0VarB.u();
                    return;
                }
                String string2 = LoginButton.this.getResources().getString(r0.f15701d);
                s.g(string2, "resources.getString(R.st…loginview_log_out_action)");
                String string3 = LoginButton.this.getResources().getString(r0.f15698a);
                s.g(string3, "resources.getString(R.st…_loginview_cancel_action)");
                s0 s0VarB = s0.f16003h.b();
                if ((s0VarB != null ? s0VarB.c() : null) != null) {
                    o0 o0Var = o0.f43602a;
                    String string4 = LoginButton.this.getResources().getString(r0.f15703f);
                    s.g(string4, "resources.getString(R.st…k_loginview_logged_in_as)");
                    string = String.format(string4, Arrays.copyOf(new Object[]{s0VarB.c()}, 1));
                    s.g(string, "format(format, *args)");
                } else {
                    string = LoginButton.this.getResources().getString(r0.f15704g);
                    s.g(string, "{\n          resources.ge…using_facebook)\n        }");
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setMessage(string).setCancelable(true).setPositiveButton(string2, new DialogInterface.OnClickListener() { // from class: com.facebook.login.widget.d
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        LoginButton.c.g(f0VarB, dialogInterface, i10);
                    }
                }).setNegativeButton(string3, (DialogInterface.OnClickListener) null);
                builder.create().show();
            } catch (Throwable th2) {
                x7.a.b(th2, this);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v10) {
            if (x7.a.c(this)) {
                return;
            }
            try {
                if (x7.a.c(this)) {
                    return;
                }
                try {
                    s.h(v10, "v");
                    LoginButton.this.b(v10);
                    com.facebook.a.c cVar = com.facebook.a.f14853l;
                    com.facebook.a aVarE = cVar.e();
                    boolean zG = cVar.g();
                    if (zG) {
                        Context context = LoginButton.this.getContext();
                        s.g(context, "context");
                        f(context);
                    } else {
                        e();
                    }
                    com.facebook.appevents.o0 o0Var = new com.facebook.appevents.o0(LoginButton.this.getContext());
                    Bundle bundle = new Bundle();
                    bundle.putInt("logging_in", aVarE != null ? 0 : 1);
                    bundle.putInt("access_token_expired", zG ? 1 : 0);
                    o0Var.g("fb_login_view_usage", bundle);
                } catch (Throwable th2) {
                    x7.a.b(th2, this);
                }
            } catch (Throwable th3) {
                x7.a.b(th3, this);
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.facebook.login.widget.LoginButton$d, still in use, count: 1, list:
      (r0v0 com.facebook.login.widget.LoginButton$d) from 0x0032: SPUT (r0v0 com.facebook.login.widget.LoginButton$d) (LINE:51) com.facebook.login.widget.LoginButton.d.d com.facebook.login.widget.LoginButton$d
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d {
        AUTOMATIC("automatic", 0),
        DISPLAY_ALWAYS("display_always", 1),
        NEVER_DISPLAY("never_display", 2);


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final d f15864d = new d("automatic", 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f15869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f15870b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f15863c = new a(null);

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a(int i10) {
                for (d dVar : d.values()) {
                    if (dVar.h() == i10) {
                        return dVar;
                    }
                }
                return null;
            }

            public final d b() {
                return d.f15864d;
            }

            private a() {
            }
        }

        static {
        }

        private d(String str, int i10) {
            super(str, i);
            this.f15869a = str;
            this.f15870b = i10;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f15868h.clone();
        }

        public final int h() {
            return this.f15870b;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f15869a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15871a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.AUTOMATIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.DISPLAY_ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.NEVER_DISPLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f15871a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class f extends m {
        f() {
        }

        @Override // com.facebook.m
        protected void d(com.facebook.a aVar, com.facebook.a aVar2) {
            LoginButton.this.E();
            LoginButton.this.C();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class g extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f15873a = new g();

        g() {
            super(0);
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final f0 invoke() {
            return f0.f15590j.c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected LoginButton(Context context, AttributeSet attributeSet, int i10, int i11, String analyticsButtonCreatedEventName, String analyticsButtonTappedEventName) {
        super(context, attributeSet, i10, i11, analyticsButtonCreatedEventName, analyticsButtonTappedEventName);
        s.h(context, "context");
        s.h(analyticsButtonCreatedEventName, "analyticsButtonCreatedEventName");
        s.h(analyticsButtonTappedEventName, "analyticsButtonTappedEventName");
        this.properties = new b();
        this.toolTipStyle = i.c.BLUE;
        this.toolTipMode = d.f15863c.b();
        this.toolTipDisplayTime = 6000L;
        this.loginManagerLazy = l.b(g.f15873a);
        this.customButtonTransparency = 255;
        String string = UUID.randomUUID().toString();
        s.g(string, "randomUUID().toString()");
        this.loggerID = string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(r.a aVar) {
    }

    private final void G(w settings) {
        if (x7.a.c(this) || settings == null) {
            return;
        }
        try {
            if (settings.m() && getVisibility() == 0) {
                x(settings.l());
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    private final void t() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            int i10 = e.f15871a[this.toolTipMode.ordinal()];
            if (i10 == 1) {
                final String strK = e1.K(getContext());
                h0.v().execute(new Runnable() { // from class: com.facebook.login.widget.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginButton.u(strK, this);
                    }
                });
            } else {
                if (i10 != 2) {
                    return;
                }
                String string = getResources().getString(r0.f15705h);
                s.g(string, "resources.getString(R.st…facebook_tooltip_default)");
                x(string);
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(LoginButton this$0, w wVar) {
        s.h(this$0, "this$0");
        this$0.G(wVar);
    }

    private final void x(String toolTipString) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            i iVar = new i(toolTipString, this);
            iVar.h(this.toolTipStyle);
            iVar.g(this.toolTipDisplayTime);
            iVar.i();
            this.toolTipPopup = iVar;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    private final int z(String text) {
        if (x7.a.c(this)) {
            return 0;
        }
        try {
            return getCompoundPaddingLeft() + getCompoundDrawablePadding() + f(text) + getCompoundPaddingRight();
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return 0;
        }
    }

    protected final void B(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            s.h(context, "context");
            d.a aVar = d.f15863c;
            this.toolTipMode = aVar.b();
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, t0.W, defStyleAttr, defStyleRes);
            s.g(typedArrayObtainStyledAttributes, "context\n            .the…efStyleAttr, defStyleRes)");
            try {
                this.confirmLogout = typedArrayObtainStyledAttributes.getBoolean(t0.X, true);
                setLoginText(typedArrayObtainStyledAttributes.getString(t0.f15717a0));
                setLogoutText(typedArrayObtainStyledAttributes.getString(t0.f15719b0));
                d dVarA = aVar.a(typedArrayObtainStyledAttributes.getInt(t0.f15721c0, aVar.b().h()));
                if (dVarA == null) {
                    dVarA = aVar.b();
                }
                this.toolTipMode = dVarA;
                int i10 = t0.Y;
                if (typedArrayObtainStyledAttributes.hasValue(i10)) {
                    this.customButtonRadius = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(i10, 0.0f));
                }
                int integer = typedArrayObtainStyledAttributes.getInteger(t0.Z, 255);
                this.customButtonTransparency = integer;
                int iMax = Math.max(0, integer);
                this.customButtonTransparency = iMax;
                this.customButtonTransparency = Math.min(255, iMax);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    protected final void C() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            setCompoundDrawablesWithIntrinsicBounds(i.a.b(getContext(), com.facebook.common.b.f15040a), (Drawable) null, (Drawable) null, (Drawable) null);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    protected final void D() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            Float f10 = this.customButtonRadius;
            if (f10 != null) {
                float fFloatValue = f10.floatValue();
                Drawable background = getBackground();
                if (Build.VERSION.SDK_INT >= 29 && (background instanceof StateListDrawable)) {
                    int stateCount = ((StateListDrawable) background).getStateCount();
                    for (int i10 = 0; i10 < stateCount; i10++) {
                        Drawable stateDrawable = ((StateListDrawable) background).getStateDrawable(i10);
                        GradientDrawable gradientDrawable = stateDrawable instanceof GradientDrawable ? (GradientDrawable) stateDrawable : null;
                        if (gradientDrawable != null) {
                            gradientDrawable.setCornerRadius(fFloatValue);
                        }
                    }
                }
                if (background instanceof GradientDrawable) {
                    ((GradientDrawable) background).setCornerRadius(fFloatValue);
                }
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    protected final void E() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            Resources resources = getResources();
            if (!isInEditMode() && com.facebook.a.f14853l.g()) {
                String string = this.logoutText;
                if (string == null) {
                    string = resources.getString(r0.f15702e);
                }
                setText(string);
                return;
            }
            String str = this.loginText;
            if (str != null) {
                setText(str);
                return;
            }
            String string2 = resources.getString(getLoginButtonContinueLabel());
            s.g(string2, "resources.getString(loginButtonContinueLabel)");
            int width = getWidth();
            if (width != 0 && z(string2) > width) {
                string2 = resources.getString(r0.f15699b);
                s.g(string2, "resources.getString(R.st…_loginview_log_in_button)");
            }
            setText(string2);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    protected final void F() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            getBackground().setAlpha(this.customButtonTransparency);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    @Override // com.facebook.t
    protected void c(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            s.h(context, "context");
            super.c(context, attrs, defStyleAttr, defStyleRes);
            setInternalOnClickListener(getNewLoginClickListener());
            B(context, attrs, defStyleAttr, defStyleRes);
            if (isInEditMode()) {
                setBackgroundColor(getResources().getColor(com.facebook.common.a.f15039a));
                setLoginText("Continue with Facebook");
            } else {
                this.accessTokenTracker = new f();
            }
            E();
            D();
            F();
            C();
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public final String getAuthType() {
        return this.properties.a();
    }

    public final r getCallbackManager() {
        return this.callbackManager;
    }

    public final com.facebook.login.e getDefaultAudience() {
        return this.properties.b();
    }

    @Override // com.facebook.t
    protected int getDefaultRequestCode() {
        if (x7.a.c(this)) {
            return 0;
        }
        try {
            return com.facebook.internal.e.c.Login.g();
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return 0;
        }
    }

    @Override // com.facebook.t
    protected int getDefaultStyleResource() {
        return com.facebook.login.s0.f15712a;
    }

    public final String getLoggerID() {
        return this.loggerID;
    }

    public final v getLoginBehavior() {
        return this.properties.c();
    }

    protected final int getLoginButtonContinueLabel() {
        return r0.f15700c;
    }

    protected final k getLoginManagerLazy() {
        return this.loginManagerLazy;
    }

    public final i0 getLoginTargetApp() {
        return this.properties.d();
    }

    public final String getLoginText() {
        return this.loginText;
    }

    public final String getLogoutText() {
        return this.logoutText;
    }

    public final String getMessengerPageId() {
        return this.properties.e();
    }

    protected c getNewLoginClickListener() {
        return new c();
    }

    public final List<String> getPermissions() {
        return this.properties.f();
    }

    protected final b getProperties() {
        return this.properties;
    }

    public final boolean getResetMessengerState() {
        return this.properties.g();
    }

    public final boolean getShouldSkipAccountDeduplication() {
        return this.properties.h();
    }

    public final long getToolTipDisplayTime() {
        return this.toolTipDisplayTime;
    }

    public final d getToolTipMode() {
        return this.toolTipMode;
    }

    public final i.c getToolTipStyle() {
        return this.toolTipStyle;
    }

    @Override // com.facebook.t, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            super.onAttachedToWindow();
            if (getContext() instanceof f.g) {
                Object context = getContext();
                s.f(context, "null cannot be cast to non-null type androidx.activity.result.ActivityResultRegistryOwner");
                this.androidXLoginCaller = ((f.g) context).getActivityResultRegistry().o("facebook-login", ((f0) this.loginManagerLazy.getValue()).i(this.callbackManager, this.loggerID), new f.b() { // from class: com.facebook.login.widget.b
                    @Override // f.b
                    public final void a(Object obj) {
                        LoginButton.A((r.a) obj);
                    }
                });
            }
            m mVar = this.accessTokenTracker;
            if (mVar == null || !mVar.c()) {
                return;
            }
            mVar.e();
            E();
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            super.onDetachedFromWindow();
            f.c cVar = this.androidXLoginCaller;
            if (cVar != null) {
                cVar.d();
            }
            m mVar = this.accessTokenTracker;
            if (mVar != null) {
                mVar.f();
            }
            w();
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    @Override // com.facebook.t, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            s.h(canvas, "canvas");
            super.onDraw(canvas);
            if (this.toolTipChecked || isInEditMode()) {
                return;
            }
            this.toolTipChecked = true;
            t();
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            super.onLayout(changed, left, top, right, bottom);
            try {
                E();
            } catch (Throwable th2) {
                th = th2;
                x7.a.b(th, this);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
            int compoundPaddingTop = getCompoundPaddingTop() + ((int) Math.ceil(Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom))) + getCompoundPaddingBottom();
            Resources resources = getResources();
            int iY = y(widthMeasureSpec);
            String string = this.logoutText;
            if (string == null) {
                string = resources.getString(r0.f15702e);
                s.g(string, "resources.getString(R.st…loginview_log_out_button)");
            }
            setMeasuredDimension(View.resolveSize(Math.max(iY, z(string)), widthMeasureSpec), compoundPaddingTop);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onVisibilityChanged(View changedView, int visibility) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            s.h(changedView, "changedView");
            super.onVisibilityChanged(changedView, visibility);
            if (visibility != 0) {
                w();
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public final void setAuthType(String value) {
        s.h(value, "value");
        this.properties.i(value);
    }

    public final void setDefaultAudience(com.facebook.login.e value) {
        s.h(value, "value");
        this.properties.j(value);
    }

    public final void setLoginBehavior(v value) {
        s.h(value, "value");
        this.properties.k(value);
    }

    protected final void setLoginManagerLazy(k kVar) {
        s.h(kVar, "<set-?>");
        this.loginManagerLazy = kVar;
    }

    public final void setLoginTargetApp(i0 value) {
        s.h(value, "value");
        this.properties.l(value);
    }

    public final void setLoginText(String str) {
        this.loginText = str;
        E();
    }

    public final void setLogoutText(String str) {
        this.logoutText = str;
        E();
    }

    public final void setMessengerPageId(String str) {
        this.properties.m(str);
    }

    public final void setPermissions(String... permissions) {
        s.h(permissions, "permissions");
        this.properties.n(gl.r.p(Arrays.copyOf(permissions, permissions.length)));
    }

    public final void setPublishPermissions(List<String> permissions) {
        s.h(permissions, "permissions");
        this.properties.n(permissions);
    }

    public final void setReadPermissions(List<String> permissions) {
        s.h(permissions, "permissions");
        this.properties.n(permissions);
    }

    public final void setResetMessengerState(boolean z10) {
        this.properties.o(z10);
    }

    public final void setToolTipDisplayTime(long j10) {
        this.toolTipDisplayTime = j10;
    }

    public final void setToolTipMode(d dVar) {
        s.h(dVar, "<set-?>");
        this.toolTipMode = dVar;
    }

    public final void setToolTipStyle(i.c cVar) {
        s.h(cVar, "<set-?>");
        this.toolTipStyle = cVar;
    }

    public final void w() {
        i iVar = this.toolTipPopup;
        if (iVar != null) {
            iVar.d();
        }
        this.toolTipPopup = null;
    }

    protected final int y(int widthMeasureSpec) {
        if (x7.a.c(this)) {
            return 0;
        }
        try {
            Resources resources = getResources();
            String string = this.loginText;
            if (string == null) {
                string = resources.getString(r0.f15700c);
                int iZ = z(string);
                if (View.resolveSize(iZ, widthMeasureSpec) < iZ) {
                    string = resources.getString(r0.f15699b);
                }
            }
            return z(string);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(String str, final LoginButton this$0) {
        s.h(str, mTFeqtajA.eNAbjZog);
        s.h(this$0, "this$0");
        final w wVarV = a0.v(str, false);
        this$0.getActivity().runOnUiThread(new Runnable() { // from class: com.facebook.login.widget.c
            @Override // java.lang.Runnable
            public final void run() {
                LoginButton.v(this.f15889a, wVarV);
            }
        });
    }

    public final void setPermissions(List<String> value) {
        s.h(value, "value");
        this.properties.n(value);
    }

    public final void setPublishPermissions(String... permissions) {
        s.h(permissions, "permissions");
        this.properties.n(gl.r.p(Arrays.copyOf(permissions, permissions.length)));
    }

    public final void setReadPermissions(String... permissions) {
        s.h(permissions, "permissions");
        this.properties.n(gl.r.p(Arrays.copyOf(permissions, permissions.length)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginButton(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0, "fb_login_button_create", "fb_login_button_did_tap");
        s.h(context, "context");
    }
}

package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class NotificationCompat {
    public static final int BADGE_ICON_LARGE = 2;
    public static final int BADGE_ICON_NONE = 0;
    public static final int BADGE_ICON_SMALL = 1;
    public static final String CATEGORY_ALARM = "alarm";
    public static final String CATEGORY_CALL = "call";
    public static final String CATEGORY_EMAIL = "email";
    public static final String CATEGORY_ERROR = "err";
    public static final String CATEGORY_EVENT = "event";
    public static final String CATEGORY_LOCATION_SHARING = "location_sharing";
    public static final String CATEGORY_MESSAGE = "msg";
    public static final String CATEGORY_MISSED_CALL = "missed_call";
    public static final String CATEGORY_NAVIGATION = "navigation";
    public static final String CATEGORY_PROGRESS = "progress";
    public static final String CATEGORY_PROMO = "promo";
    public static final String CATEGORY_RECOMMENDATION = "recommendation";
    public static final String CATEGORY_REMINDER = "reminder";
    public static final String CATEGORY_SERVICE = "service";
    public static final String CATEGORY_SOCIAL = "social";
    public static final String CATEGORY_STATUS = "status";
    public static final String CATEGORY_STOPWATCH = "stopwatch";
    public static final String CATEGORY_SYSTEM = "sys";
    public static final String CATEGORY_TRANSPORT = "transport";
    public static final String CATEGORY_VOICEMAIL = "voicemail";
    public static final String CATEGORY_WORKOUT = "workout";
    public static final int COLOR_DEFAULT = 0;
    public static final int DEFAULT_ALL = -1;
    public static final int DEFAULT_LIGHTS = 4;
    public static final int DEFAULT_SOUND = 1;
    public static final int DEFAULT_VIBRATE = 2;
    public static final String EXTRA_ANSWER_COLOR = "android.answerColor";
    public static final String EXTRA_ANSWER_INTENT = "android.answerIntent";
    public static final String EXTRA_AUDIO_CONTENTS_URI = "android.audioContents";
    public static final String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";
    public static final String EXTRA_BIG_TEXT = "android.bigText";
    public static final String EXTRA_CALL_IS_VIDEO = "android.callIsVideo";
    public static final String EXTRA_CALL_PERSON = "android.callPerson";
    public static final String EXTRA_CALL_PERSON_COMPAT = "android.callPersonCompat";
    public static final String EXTRA_CALL_TYPE = "android.callType";
    public static final String EXTRA_CHANNEL_GROUP_ID = "android.intent.extra.CHANNEL_GROUP_ID";
    public static final String EXTRA_CHANNEL_ID = "android.intent.extra.CHANNEL_ID";
    public static final String EXTRA_CHRONOMETER_COUNT_DOWN = "android.chronometerCountDown";
    public static final String EXTRA_COLORIZED = "android.colorized";
    public static final String EXTRA_COMPACT_ACTIONS = "android.compactActions";
    public static final String EXTRA_COMPAT_TEMPLATE = "androidx.core.app.extra.COMPAT_TEMPLATE";
    public static final String EXTRA_CONVERSATION_TITLE = "android.conversationTitle";
    public static final String EXTRA_DECLINE_COLOR = "android.declineColor";
    public static final String EXTRA_DECLINE_INTENT = "android.declineIntent";
    public static final String EXTRA_HANG_UP_INTENT = "android.hangUpIntent";
    public static final String EXTRA_HIDDEN_CONVERSATION_TITLE = "android.hiddenConversationTitle";
    public static final String EXTRA_HISTORIC_MESSAGES = "android.messages.historic";
    public static final String EXTRA_INFO_TEXT = "android.infoText";
    public static final String EXTRA_IS_GROUP_CONVERSATION = "android.isGroupConversation";
    public static final String EXTRA_LARGE_ICON = "android.largeIcon";
    public static final String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";
    public static final String EXTRA_MEDIA_SESSION = "android.mediaSession";
    public static final String EXTRA_MESSAGES = "android.messages";
    public static final String EXTRA_MESSAGING_STYLE_USER = "android.messagingStyleUser";
    public static final String EXTRA_NOTIFICATION_ID = "android.intent.extra.NOTIFICATION_ID";
    public static final String EXTRA_NOTIFICATION_TAG = "android.intent.extra.NOTIFICATION_TAG";

    @Deprecated
    public static final String EXTRA_PEOPLE = "android.people";
    public static final String EXTRA_PEOPLE_LIST = "android.people.list";
    public static final String EXTRA_PICTURE = "android.picture";
    public static final String EXTRA_PICTURE_CONTENT_DESCRIPTION = "android.pictureContentDescription";
    public static final String EXTRA_PICTURE_ICON = "android.pictureIcon";
    public static final String EXTRA_PROGRESS = "android.progress";
    public static final String EXTRA_PROGRESS_END_ICON = "android.progressEndIcon";
    public static final String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";
    public static final String EXTRA_PROGRESS_MAX = "android.progressMax";
    public static final String EXTRA_PROGRESS_POINTS = "android.progressPoints";
    public static final String EXTRA_PROGRESS_SEGMENTS = "android.progressSegments";
    public static final String EXTRA_PROGRESS_START_ICON = "android.progressStartIcon";
    public static final String EXTRA_PROGRESS_TRACKER_ICON = "android.progressTrackerIcon";
    public static final String EXTRA_REMOTE_INPUT_HISTORY = "android.remoteInputHistory";
    public static final String EXTRA_REQUEST_PROMOTED_ONGOING = "android.requestPromotedOngoing";
    public static final String EXTRA_SELF_DISPLAY_NAME = "android.selfDisplayName";
    public static final String EXTRA_SHORT_CRITICAL_TEXT = "android.shortCriticalText";
    public static final String EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED = "android.showBigPictureWhenCollapsed";
    public static final String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";
    public static final String EXTRA_SHOW_WHEN = "android.showWhen";
    public static final String EXTRA_SMALL_ICON = "android.icon";
    public static final String EXTRA_STYLED_BY_PROGRESS = "android.styledByProgress";
    public static final String EXTRA_SUB_TEXT = "android.subText";
    public static final String EXTRA_SUMMARY_TEXT = "android.summaryText";
    public static final String EXTRA_TEMPLATE = "android.template";
    public static final String EXTRA_TEXT = "android.text";
    public static final String EXTRA_TEXT_LINES = "android.textLines";
    public static final String EXTRA_TITLE = "android.title";
    public static final String EXTRA_TITLE_BIG = "android.title.big";
    public static final String EXTRA_VERIFICATION_ICON = "android.verificationIcon";
    public static final String EXTRA_VERIFICATION_ICON_COMPAT = "android.verificationIconCompat";
    public static final String EXTRA_VERIFICATION_TEXT = "android.verificationText";
    public static final int FLAG_AUTO_CANCEL = 16;
    public static final int FLAG_BUBBLE = 4096;
    public static final int FLAG_FOREGROUND_SERVICE = 64;
    public static final int FLAG_GROUP_SUMMARY = 512;

    @Deprecated
    public static final int FLAG_HIGH_PRIORITY = 128;
    public static final int FLAG_INSISTENT = 4;
    public static final int FLAG_LOCAL_ONLY = 256;
    public static final int FLAG_NO_CLEAR = 32;
    public static final int FLAG_ONGOING_EVENT = 2;
    public static final int FLAG_ONLY_ALERT_ONCE = 8;
    public static final int FLAG_SHOW_LIGHTS = 1;
    public static final int FOREGROUND_SERVICE_DEFAULT = 0;
    public static final int FOREGROUND_SERVICE_DEFERRED = 2;
    public static final int FOREGROUND_SERVICE_IMMEDIATE = 1;
    public static final int GROUP_ALERT_ALL = 0;
    public static final int GROUP_ALERT_CHILDREN = 2;
    public static final int GROUP_ALERT_SUMMARY = 1;
    public static final String GROUP_KEY_SILENT = "silent";
    public static final String INTENT_CATEGORY_NOTIFICATION_PREFERENCES = "android.intent.category.NOTIFICATION_PREFERENCES";
    public static final int MAX_ACTION_BUTTONS = 3;
    public static final int PRIORITY_DEFAULT = 0;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = -1;
    public static final int PRIORITY_MAX = 2;
    public static final int PRIORITY_MIN = -2;
    public static final int STREAM_DEFAULT = -1;
    private static final String TAG = "NotifCompat";
    public static final int VISIBILITY_PRIVATE = 0;
    public static final int VISIBILITY_PUBLIC = 1;
    public static final int VISIBILITY_SECRET = -1;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Bundle f3198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private IconCompat f3199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final x[] f3200c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final x[] f3201d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f3202e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f3203f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f3204g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f3205h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f3206i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public CharSequence f3207j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public PendingIntent f3208k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f3209l;

        public b(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.i(null, "", i10) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f3208k;
        }

        public boolean b() {
            return this.f3202e;
        }

        public Bundle c() {
            return this.f3198a;
        }

        public IconCompat d() {
            int i10;
            if (this.f3199b == null && (i10 = this.f3206i) != 0) {
                this.f3199b = IconCompat.i(null, "", i10);
            }
            return this.f3199b;
        }

        public x[] e() {
            return this.f3200c;
        }

        public int f() {
            return this.f3204g;
        }

        public boolean g() {
            return this.f3203f;
        }

        public CharSequence h() {
            return this.f3207j;
        }

        public boolean i() {
            return this.f3209l;
        }

        public boolean j() {
            return this.f3205h;
        }

        public b(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (x[]) null, (x[]) null, true, 0, true, false, false);
        }

        b(int i10, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, x[] xVarArr, x[] xVarArr2, boolean z10, int i11, boolean z11, boolean z12, boolean z13) {
            this(i10 != 0 ? IconCompat.i(null, "", i10) : null, charSequence, pendingIntent, bundle, xVarArr, xVarArr2, z10, i11, z11, z12, z13);
        }

        b(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, x[] xVarArr, x[] xVarArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f3203f = true;
            this.f3199b = iconCompat;
            if (iconCompat != null && iconCompat.m() == 2) {
                this.f3206i = iconCompat.k();
            }
            this.f3207j = l.d(charSequence);
            this.f3208k = pendingIntent;
            this.f3198a = bundle == null ? new Bundle() : bundle;
            this.f3200c = xVarArr;
            this.f3201d = xVarArr2;
            this.f3202e = z10;
            this.f3204g = i10;
            this.f3203f = z11;
            this.f3205h = z12;
            this.f3209l = z13;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class c {
        static boolean a(Notification.Action action) {
            return action.getAllowGeneratedReplies();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class d {
        static int a(Notification notification) {
            return notification.getBadgeIconType();
        }

        static String b(Notification notification) {
            return notification.getChannelId();
        }

        static int c(Notification notification) {
            return notification.getGroupAlertBehavior();
        }

        static CharSequence d(Notification notification) {
            return notification.getSettingsText();
        }

        static String e(Notification notification) {
            return notification.getShortcutId();
        }

        static long f(Notification notification) {
            return notification.getTimeoutAfter();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class e {
        static int a(Notification.Action action) {
            return action.getSemanticAction();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class f {
        static boolean a(Notification notification) {
            return notification.getAllowSystemGeneratedContextualActions();
        }

        static Notification.BubbleMetadata b(Notification notification) {
            return notification.getBubbleMetadata();
        }

        static int c(RemoteInput remoteInput) {
            return remoteInput.getEditChoicesBeforeSending();
        }

        static LocusId d(Notification notification) {
            return notification.getLocusId();
        }

        static boolean e(Notification.Action action) {
            return action.isContextual();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class g {
        static boolean a(Notification.Action action) {
            return action.isAuthenticationRequired();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class h {
        static boolean a(Notification notification) {
            return notification.hasPromotableCharacteristics();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class i extends m {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private IconCompat f3210e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private IconCompat f3211f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f3212g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private CharSequence f3213h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f3214i;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        private static class a {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
                bigPictureStyle.showBigPictureWhenCollapsed(z10);
            }
        }

        @Override // androidx.core.app.NotificationCompat.m
        public void b(androidx.core.app.l lVar) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(lVar.a()).setBigContentTitle(this.f3257b);
            IconCompat iconCompat = this.f3210e;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    a.a(bigContentTitle, this.f3210e.s(lVar instanceof n ? ((n) lVar).f() : null));
                } else if (iconCompat.m() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f3210e.j());
                }
            }
            if (this.f3212g) {
                if (this.f3211f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    bigContentTitle.bigLargeIcon(this.f3211f.s(lVar instanceof n ? ((n) lVar).f() : null));
                }
            }
            if (this.f3259d) {
                bigContentTitle.setSummaryText(this.f3258c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                a.c(bigContentTitle, this.f3214i);
                a.b(bigContentTitle, this.f3213h);
            }
        }

        @Override // androidx.core.app.NotificationCompat.m
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public i h(Bitmap bitmap) {
            this.f3211f = bitmap == null ? null : IconCompat.f(bitmap);
            this.f3212g = true;
            return this;
        }

        public i i(Bitmap bitmap) {
            this.f3210e = bitmap == null ? null : IconCompat.f(bitmap);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class j extends m {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private CharSequence f3215e;

        @Override // androidx.core.app.NotificationCompat.m
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // androidx.core.app.NotificationCompat.m
        public void b(androidx.core.app.l lVar) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(lVar.a()).setBigContentTitle(this.f3257b).bigText(this.f3215e);
            if (this.f3259d) {
                bigTextStyleBigText.setSummaryText(this.f3258c);
            }
        }

        @Override // androidx.core.app.NotificationCompat.m
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public j h(CharSequence charSequence) {
            this.f3215e = l.d(charSequence);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private PendingIntent f3216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private PendingIntent f3217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private IconCompat f3218c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f3219d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f3220e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f3221f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f3222g;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        private static class a {
            static k a(Notification.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                    return null;
                }
                c cVarG = new c(bubbleMetadata.getIntent(), IconCompat.a(bubbleMetadata.getIcon())).b(bubbleMetadata.getAutoExpandBubble()).c(bubbleMetadata.getDeleteIntent()).g(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    cVarG.d(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    cVarG.e(bubbleMetadata.getDesiredHeightResId());
                }
                return cVarG.a();
            }

            static Notification.BubbleMetadata b(k kVar) {
                if (kVar == null || kVar.g() == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(kVar.f().r()).setIntent(kVar.g()).setDeleteIntent(kVar.c()).setAutoExpandBubble(kVar.b()).setSuppressNotification(kVar.i());
                if (kVar.d() != 0) {
                    suppressNotification.setDesiredHeight(kVar.d());
                }
                if (kVar.e() != 0) {
                    suppressNotification.setDesiredHeightResId(kVar.e());
                }
                return suppressNotification.build();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        private static class b {
            static k a(Notification.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null) {
                    return null;
                }
                c cVar = bubbleMetadata.getShortcutId() != null ? new c(bubbleMetadata.getShortcutId()) : new c(bubbleMetadata.getIntent(), IconCompat.a(bubbleMetadata.getIcon()));
                cVar.b(bubbleMetadata.getAutoExpandBubble()).c(bubbleMetadata.getDeleteIntent()).g(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    cVar.d(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    cVar.e(bubbleMetadata.getDesiredHeightResId());
                }
                return cVar.a();
            }

            static Notification.BubbleMetadata b(k kVar) {
                if (kVar == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder builder = kVar.h() != null ? new Notification.BubbleMetadata.Builder(kVar.h()) : new Notification.BubbleMetadata.Builder(kVar.g(), kVar.f().r());
                builder.setDeleteIntent(kVar.c()).setAutoExpandBubble(kVar.b()).setSuppressNotification(kVar.i());
                if (kVar.d() != 0) {
                    builder.setDesiredHeight(kVar.d());
                }
                if (kVar.e() != 0) {
                    builder.setDesiredHeightResId(kVar.e());
                }
                return builder.build();
            }
        }

        public static k a(Notification.BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                return b.a(bubbleMetadata);
            }
            if (i10 == 29) {
                return a.a(bubbleMetadata);
            }
            return null;
        }

        public static Notification.BubbleMetadata k(k kVar) {
            if (kVar == null) {
                return null;
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                return b.b(kVar);
            }
            if (i10 == 29) {
                return a.b(kVar);
            }
            return null;
        }

        public boolean b() {
            return (this.f3221f & 1) != 0;
        }

        public PendingIntent c() {
            return this.f3217b;
        }

        public int d() {
            return this.f3219d;
        }

        public int e() {
            return this.f3220e;
        }

        public IconCompat f() {
            return this.f3218c;
        }

        public PendingIntent g() {
            return this.f3216a;
        }

        public String h() {
            return this.f3222g;
        }

        public boolean i() {
            return (this.f3221f & 2) != 0;
        }

        public void j(int i10) {
            this.f3221f = i10;
        }

        private k(PendingIntent pendingIntent, PendingIntent pendingIntent2, IconCompat iconCompat, int i10, int i11, int i12, String str) {
            this.f3216a = pendingIntent;
            this.f3218c = iconCompat;
            this.f3219d = i10;
            this.f3220e = i11;
            this.f3217b = pendingIntent2;
            this.f3221f = i12;
            this.f3222g = str;
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private PendingIntent f3223a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IconCompat f3224b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f3225c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f3226d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f3227e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private PendingIntent f3228f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private String f3229g;

            public c(String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new NullPointerException("Bubble requires a non-null shortcut id");
                }
                this.f3229g = str;
            }

            private c f(int i10, boolean z10) {
                if (z10) {
                    this.f3227e = i10 | this.f3227e;
                    return this;
                }
                this.f3227e = (~i10) & this.f3227e;
                return this;
            }

            public k a() {
                String str = this.f3229g;
                if (str == null && this.f3223a == null) {
                    throw new NullPointerException("Must supply pending intent or shortcut to bubble");
                }
                if (str == null && this.f3224b == null) {
                    throw new NullPointerException("Must supply an icon or shortcut for the bubble");
                }
                k kVar = new k(this.f3223a, this.f3228f, this.f3224b, this.f3225c, this.f3226d, this.f3227e, str);
                kVar.j(this.f3227e);
                return kVar;
            }

            public c b(boolean z10) {
                f(1, z10);
                return this;
            }

            public c c(PendingIntent pendingIntent) {
                this.f3228f = pendingIntent;
                return this;
            }

            public c d(int i10) {
                this.f3225c = Math.max(i10, 0);
                this.f3226d = 0;
                return this;
            }

            public c e(int i10) {
                this.f3226d = i10;
                this.f3225c = 0;
                return this;
            }

            public c g(boolean z10) {
                f(2, z10);
                return this;
            }

            public c(PendingIntent pendingIntent, IconCompat iconCompat) {
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                if (iconCompat != null) {
                    this.f3223a = pendingIntent;
                    this.f3224b = iconCompat;
                    return;
                }
                throw new NullPointerException("Bubbles require non-null icon");
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected l f3256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        CharSequence f3257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        CharSequence f3258c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f3259d = false;

        public void a(Bundle bundle) {
            if (this.f3259d) {
                bundle.putCharSequence(NotificationCompat.EXTRA_SUMMARY_TEXT, this.f3258c);
            }
            CharSequence charSequence = this.f3257b;
            if (charSequence != null) {
                bundle.putCharSequence(NotificationCompat.EXTRA_TITLE_BIG, charSequence);
            }
            String strC = c();
            if (strC != null) {
                bundle.putString(NotificationCompat.EXTRA_COMPAT_TEMPLATE, strC);
            }
        }

        public abstract void b(androidx.core.app.l lVar);

        protected abstract String c();

        public RemoteViews d(androidx.core.app.l lVar) {
            return null;
        }

        public RemoteViews e(androidx.core.app.l lVar) {
            return null;
        }

        public RemoteViews f(androidx.core.app.l lVar) {
            return null;
        }

        public void g(l lVar) {
            if (this.f3256a != lVar) {
                this.f3256a = lVar;
                if (lVar != null) {
                    lVar.s(this);
                }
            }
        }
    }

    @Deprecated
    public NotificationCompat() {
    }

    public static b getAction(Notification notification, int i10) {
        return getActionCompatFromAction(notification.actions[i10]);
    }

    static b getActionCompatFromAction(Notification.Action action) {
        x[] xVarArr;
        int i10;
        RemoteInput[] remoteInputs = action.getRemoteInputs();
        if (remoteInputs == null) {
            xVarArr = null;
        } else {
            x[] xVarArr2 = new x[remoteInputs.length];
            for (int i11 = 0; i11 < remoteInputs.length; i11++) {
                RemoteInput remoteInput = remoteInputs[i11];
                xVarArr2[i11] = new x(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), Build.VERSION.SDK_INT >= 29 ? f.c(remoteInput) : 0, remoteInput.getExtras(), null);
            }
            xVarArr = xVarArr2;
        }
        int i12 = Build.VERSION.SDK_INT;
        boolean z10 = action.getExtras().getBoolean("android.support.allowGeneratedReplies") || c.a(action);
        boolean z11 = action.getExtras().getBoolean("android.support.action.showsUserInterface", true);
        int iA = i12 >= 28 ? e.a(action) : action.getExtras().getInt("android.support.action.semanticAction", 0);
        boolean zE = i12 >= 29 ? f.e(action) : false;
        boolean zA = i12 >= 31 ? g.a(action) : false;
        if (action.getIcon() != null || (i10 = action.icon) == 0) {
            return new b(action.getIcon() != null ? IconCompat.b(action.getIcon()) : null, action.title, action.actionIntent, action.getExtras(), xVarArr, (x[]) null, z10, iA, z11, zE, zA);
        }
        return new b(i10, action.title, action.actionIntent, action.getExtras(), xVarArr, (x[]) null, z10, iA, z11, zE, zA);
    }

    public static int getActionCount(Notification notification) {
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr.length;
        }
        return 0;
    }

    public static boolean getAllowSystemGeneratedContextualActions(Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return f.a(notification);
        }
        return false;
    }

    public static boolean getAutoCancel(Notification notification) {
        return (notification.flags & 16) != 0;
    }

    public static int getBadgeIconType(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return d.a(notification);
        }
        return 0;
    }

    public static k getBubbleMetadata(Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return k.a(f.b(notification));
        }
        return null;
    }

    public static String getCategory(Notification notification) {
        return notification.category;
    }

    public static String getChannelId(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return d.b(notification);
        }
        return null;
    }

    public static int getColor(Notification notification) {
        return notification.color;
    }

    public static CharSequence getContentInfo(Notification notification) {
        return notification.extras.getCharSequence(EXTRA_INFO_TEXT);
    }

    public static CharSequence getContentText(Notification notification) {
        return notification.extras.getCharSequence(EXTRA_TEXT);
    }

    public static CharSequence getContentTitle(Notification notification) {
        return notification.extras.getCharSequence(EXTRA_TITLE);
    }

    @Deprecated
    public static Bundle getExtras(Notification notification) {
        return notification.extras;
    }

    public static String getGroup(Notification notification) {
        return notification.getGroup();
    }

    public static int getGroupAlertBehavior(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return d.c(notification);
        }
        return 0;
    }

    static boolean getHighPriority(Notification notification) {
        return (notification.flags & 128) != 0;
    }

    public static List<b> getInvisibleActions(Notification notification) {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle2 != null && (bundle = bundle2.getBundle("invisible_actions")) != null) {
            for (int i10 = 0; i10 < bundle.size(); i10++) {
                arrayList.add(o.c(bundle.getBundle(Integer.toString(i10))));
            }
        }
        return arrayList;
    }

    public static boolean getLocalOnly(Notification notification) {
        return (notification.flags & 256) != 0;
    }

    public static androidx.core.content.c getLocusId(Notification notification) {
        LocusId locusIdD;
        if (Build.VERSION.SDK_INT < 29 || (locusIdD = f.d(notification)) == null) {
            return null;
        }
        return androidx.core.content.c.c(locusIdD);
    }

    static Notification[] getNotificationArrayFromBundle(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Notification[]) || parcelableArray == null) {
            return (Notification[]) parcelableArray;
        }
        Notification[] notificationArr = new Notification[parcelableArray.length];
        for (int i10 = 0; i10 < parcelableArray.length; i10++) {
            notificationArr[i10] = (Notification) parcelableArray[i10];
        }
        bundle.putParcelableArray(str, notificationArr);
        return notificationArr;
    }

    public static boolean getOngoing(Notification notification) {
        return (notification.flags & 2) != 0;
    }

    public static boolean getOnlyAlertOnce(Notification notification) {
        return (notification.flags & 8) != 0;
    }

    public static List<t> getPeople(Notification notification) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 28) {
            ArrayList parcelableArrayList = notification.extras.getParcelableArrayList(EXTRA_PEOPLE_LIST);
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                int size = parcelableArrayList.size();
                while (i10 < size) {
                    Object obj = parcelableArrayList.get(i10);
                    i10++;
                    arrayList.add(t.a(androidx.core.app.m.a(obj)));
                }
            }
        } else {
            String[] stringArray = notification.extras.getStringArray(EXTRA_PEOPLE);
            if (stringArray != null && stringArray.length != 0) {
                int length = stringArray.length;
                while (i10 < length) {
                    arrayList.add(new t.b().g(stringArray[i10]).a());
                    i10++;
                }
            }
        }
        return arrayList;
    }

    public static Notification getPublicVersion(Notification notification) {
        return notification.publicVersion;
    }

    public static CharSequence getSettingsText(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return d.d(notification);
        }
        return null;
    }

    public static String getShortCriticalText(Notification notification) {
        return notification.extras.getString(EXTRA_SHORT_CRITICAL_TEXT);
    }

    public static String getShortcutId(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return d.e(notification);
        }
        return null;
    }

    public static boolean getShowWhen(Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_WHEN);
    }

    public static String getSortKey(Notification notification) {
        return notification.getSortKey();
    }

    public static CharSequence getSubText(Notification notification) {
        return notification.extras.getCharSequence(EXTRA_SUB_TEXT);
    }

    public static long getTimeoutAfter(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return d.f(notification);
        }
        return 0L;
    }

    public static boolean getUsesChronometer(Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_CHRONOMETER);
    }

    public static int getVisibility(Notification notification) {
        return notification.visibility;
    }

    public static boolean hasPromotableCharacteristics(Notification notification) {
        if (Build.VERSION.SDK_INT >= 36) {
            return h.a(notification);
        }
        return false;
    }

    public static boolean isGroupSummary(Notification notification) {
        return (notification.flags & 512) != 0;
    }

    public static boolean isRequestPromotedOngoing(Notification notification) {
        return notification.extras.getBoolean(EXTRA_REQUEST_PROMOTED_ONGOING, false);
    }

    static boolean isSilent(Notification notification) {
        if (Build.VERSION.SDK_INT < 26) {
            int i10 = notification.defaults;
            return (i10 & 1) == 0 && (i10 & 2) == 0 && notification.vibrate == null && notification.sound == null;
        }
        if (GROUP_KEY_SILENT.equals(notification.getGroup())) {
            return true;
        }
        if (isGroupSummary(notification)) {
            return getGroupAlertBehavior(notification) == 2;
        }
        return getGroupAlertBehavior(notification) == 1;
    }

    public static Bitmap reduceLargeIconSize(Context context, Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(b0.b.f8205b);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(b0.b.f8204a);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class l {
        boolean A;
        boolean B;
        boolean C;
        String D;
        Bundle E;
        int F;
        int G;
        Notification H;
        RemoteViews I;
        RemoteViews J;
        RemoteViews K;
        String L;
        int M;
        String N;
        androidx.core.content.c O;
        long P;
        int Q;
        int R;
        boolean S;
        k T;
        Notification U;
        boolean V;
        Object W;
        public ArrayList X;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f3230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f3231b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList f3232c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ArrayList f3233d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        CharSequence f3234e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        CharSequence f3235f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        String f3236g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        PendingIntent f3237h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        PendingIntent f3238i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        RemoteViews f3239j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        IconCompat f3240k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        CharSequence f3241l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f3242m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f3243n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f3244o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f3245p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        m f3246q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        CharSequence f3247r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        CharSequence f3248s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        CharSequence[] f3249t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f3250u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f3251v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        boolean f3252w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        String f3253x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        boolean f3254y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        String f3255z;

        public l(Context context, String str) {
            this.f3231b = new ArrayList();
            this.f3232c = new ArrayList();
            this.f3233d = new ArrayList();
            this.f3244o = true;
            this.A = false;
            this.F = 0;
            this.G = 0;
            this.M = 0;
            this.Q = 0;
            this.R = 0;
            Notification notification = new Notification();
            this.U = notification;
            this.f3230a = context;
            this.L = str;
            notification.when = System.currentTimeMillis();
            this.U.audioStreamType = -1;
            this.f3243n = 0;
            this.X = new ArrayList();
            this.S = true;
        }

        protected static CharSequence d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void m(int i10, boolean z10) {
            if (z10) {
                Notification notification = this.U;
                notification.flags = i10 | notification.flags;
            } else {
                Notification notification2 = this.U;
                notification2.flags = (~i10) & notification2.flags;
            }
        }

        public l a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f3231b.add(new b(i10, charSequence, pendingIntent));
            return this;
        }

        public Notification b() {
            return new n(this).c();
        }

        public Bundle c() {
            if (this.E == null) {
                this.E = new Bundle();
            }
            return this.E;
        }

        public l e(boolean z10) {
            m(16, z10);
            return this;
        }

        public l f(String str) {
            this.L = str;
            return this;
        }

        public l g(PendingIntent pendingIntent) {
            this.f3237h = pendingIntent;
            return this;
        }

        public l h(CharSequence charSequence) {
            this.f3235f = d(charSequence);
            return this;
        }

        public l i(CharSequence charSequence) {
            this.f3234e = d(charSequence);
            return this;
        }

        public l j(RemoteViews remoteViews) {
            this.J = remoteViews;
            return this;
        }

        public l k(RemoteViews remoteViews) {
            this.I = remoteViews;
            return this;
        }

        public l l(PendingIntent pendingIntent) {
            this.U.deleteIntent = pendingIntent;
            return this;
        }

        public l n(Bitmap bitmap) {
            this.f3240k = bitmap == null ? null : IconCompat.f(NotificationCompat.reduceLargeIconSize(this.f3230a, bitmap));
            return this;
        }

        public l o(boolean z10) {
            this.A = z10;
            return this;
        }

        public l p(boolean z10) {
            m(2, z10);
            return this;
        }

        public l q(int i10) {
            this.f3243n = i10;
            return this;
        }

        public l r(int i10) {
            this.U.icon = i10;
            return this;
        }

        public l s(m mVar) {
            if (this.f3246q != mVar) {
                this.f3246q = mVar;
                if (mVar != null) {
                    mVar.g(this);
                }
            }
            return this;
        }

        public l t(CharSequence charSequence) {
            this.U.tickerText = d(charSequence);
            return this;
        }

        public l u(long j10) {
            this.U.when = j10;
            return this;
        }

        public l(Context context) {
            this(context, null);
        }
    }
}

package androidx.core.app;

import android.app.Notification;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class n implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f3292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Notification.Builder f3293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final NotificationCompat.l f3294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RemoteViews f3295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RemoteViews f3296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Bundle f3297f = new Bundle();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f3298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private RemoteViews f3299h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAllowGeneratedReplies(z10);
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b {
        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setBadgeIconType(i10);
        }

        static Notification.Builder c(Notification.Builder builder, boolean z10) {
            return builder.setColorized(z10);
        }

        static Notification.Builder d(Notification.Builder builder, int i10) {
            return builder.setGroupAlertBehavior(i10);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder g(Notification.Builder builder, long j10) {
            return builder.setTimeoutAfter(j10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class c {
        static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, int i10) {
            return builder.setSemanticAction(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class d {
        static Notification.Builder a(Notification.Builder builder, boolean z10) {
            return builder.setAllowSystemGeneratedContextualActions(z10);
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z10) {
            return builder.setContextual(z10);
        }

        static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class e {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAuthenticationRequired(z10);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setForegroundServiceBehavior(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class f {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.setShortCriticalText(str);
        }
    }

    n(NotificationCompat.l lVar) {
        int i10;
        this.f3294c = lVar;
        Context context = lVar.f3230a;
        this.f3292a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3293b = b.a(context, lVar.L);
        } else {
            this.f3293b = new Notification.Builder(lVar.f3230a);
        }
        Notification notification = lVar.U;
        int i11 = 0;
        this.f3293b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, lVar.f3239j).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(lVar.f3234e).setContentText(lVar.f3235f).setContentInfo(lVar.f3241l).setContentIntent(lVar.f3237h).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(lVar.f3238i, (notification.flags & 128) != 0).setNumber(lVar.f3242m).setProgress(lVar.f3250u, lVar.f3251v, lVar.f3252w);
        Notification.Builder builder = this.f3293b;
        IconCompat iconCompat = lVar.f3240k;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.s(context));
        this.f3293b.setSubText(lVar.f3247r).setUsesChronometer(lVar.f3245p).setPriority(lVar.f3243n);
        ArrayList arrayList = lVar.f3231b;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            b((NotificationCompat.b) obj);
        }
        Bundle bundle = lVar.E;
        if (bundle != null) {
            this.f3297f.putAll(bundle);
        }
        this.f3295d = lVar.I;
        this.f3296e = lVar.J;
        this.f3293b.setShowWhen(lVar.f3244o);
        this.f3293b.setLocalOnly(lVar.A);
        this.f3293b.setGroup(lVar.f3253x);
        this.f3293b.setSortKey(lVar.f3255z);
        this.f3293b.setGroupSummary(lVar.f3254y);
        this.f3298g = lVar.Q;
        this.f3293b.setCategory(lVar.D);
        this.f3293b.setColor(lVar.F);
        this.f3293b.setVisibility(lVar.G);
        this.f3293b.setPublicVersion(lVar.H);
        this.f3293b.setSound(notification.sound, notification.audioAttributes);
        List listE = Build.VERSION.SDK_INT < 28 ? e(g(lVar.f3232c), lVar.X) : lVar.X;
        if (listE != null && !listE.isEmpty()) {
            Iterator it = listE.iterator();
            while (it.hasNext()) {
                this.f3293b.addPerson((String) it.next());
            }
        }
        this.f3299h = lVar.K;
        if (lVar.f3233d.size() > 0) {
            Bundle bundle2 = lVar.c().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i13 = 0; i13 < lVar.f3233d.size(); i13++) {
                bundle4.putBundle(Integer.toString(i13), o.e((NotificationCompat.b) lVar.f3233d.get(i13)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            lVar.c().putBundle("android.car.EXTENSIONS", bundle2);
            this.f3297f.putBundle("android.car.EXTENSIONS", bundle3);
        }
        Object obj2 = lVar.W;
        if (obj2 != null) {
            this.f3293b.setSmallIcon((Icon) obj2);
        }
        int i14 = Build.VERSION.SDK_INT;
        this.f3293b.setExtras(lVar.E);
        a.e(this.f3293b, lVar.f3249t);
        RemoteViews remoteViews = lVar.I;
        if (remoteViews != null) {
            a.c(this.f3293b, remoteViews);
        }
        RemoteViews remoteViews2 = lVar.J;
        if (remoteViews2 != null) {
            a.b(this.f3293b, remoteViews2);
        }
        RemoteViews remoteViews3 = lVar.K;
        if (remoteViews3 != null) {
            a.d(this.f3293b, remoteViews3);
        }
        if (i14 >= 26) {
            b.b(this.f3293b, lVar.M);
            b.e(this.f3293b, lVar.f3248s);
            b.f(this.f3293b, lVar.N);
            b.g(this.f3293b, lVar.P);
            b.d(this.f3293b, lVar.Q);
            if (lVar.C) {
                b.c(this.f3293b, lVar.B);
            }
            if (!TextUtils.isEmpty(lVar.L)) {
                this.f3293b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i14 >= 28) {
            ArrayList arrayList2 = lVar.f3232c;
            int size2 = arrayList2.size();
            while (i11 < size2) {
                Object obj3 = arrayList2.get(i11);
                i11++;
                c.a(this.f3293b, ((t) obj3).i());
            }
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 29) {
            d.a(this.f3293b, lVar.S);
            d.b(this.f3293b, NotificationCompat.k.k(lVar.T));
            androidx.core.content.c cVar = lVar.O;
            if (cVar != null) {
                d.d(this.f3293b, cVar.b());
            }
        }
        if (i15 >= 31 && (i10 = lVar.R) != 0) {
            e.b(this.f3293b, i10);
        }
        if (i15 >= 36) {
            f.a(this.f3293b, lVar.f3236g);
        }
        if (lVar.V) {
            if (this.f3294c.f3254y) {
                this.f3298g = 2;
            } else {
                this.f3298g = 1;
            }
            this.f3293b.setVibrate(null);
            this.f3293b.setSound(null);
            int i16 = notification.defaults & (-4);
            notification.defaults = i16;
            this.f3293b.setDefaults(i16);
            if (i15 >= 26) {
                if (TextUtils.isEmpty(this.f3294c.f3253x)) {
                    this.f3293b.setGroup(NotificationCompat.GROUP_KEY_SILENT);
                }
                b.d(this.f3293b, this.f3298g);
            }
        }
    }

    private void b(NotificationCompat.b bVar) {
        IconCompat iconCompatD = bVar.d();
        Notification.Action.Builder builder = new Notification.Action.Builder(iconCompatD != null ? iconCompatD.r() : null, bVar.h(), bVar.a());
        if (bVar.e() != null) {
            for (RemoteInput remoteInput : x.b(bVar.e())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = bVar.c() != null ? new Bundle(bVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", bVar.b());
        int i10 = Build.VERSION.SDK_INT;
        a.a(builder, bVar.b());
        bundle.putInt("android.support.action.semanticAction", bVar.f());
        if (i10 >= 28) {
            c.b(builder, bVar.f());
        }
        if (i10 >= 29) {
            d.c(builder, bVar.j());
        }
        if (i10 >= 31) {
            e.a(builder, bVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", bVar.g());
        builder.addExtras(bundle);
        this.f3293b.addAction(builder.build());
    }

    private static List e(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        androidx.collection.b bVar = new androidx.collection.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List g(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((t) it.next()).h());
        }
        return arrayList;
    }

    private void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    @Override // androidx.core.app.l
    public Notification.Builder a() {
        return this.f3293b;
    }

    public Notification c() {
        Bundle extras;
        RemoteViews remoteViewsF;
        RemoteViews remoteViewsD;
        NotificationCompat.m mVar = this.f3294c.f3246q;
        if (mVar != null) {
            mVar.b(this);
        }
        RemoteViews remoteViewsE = mVar != null ? mVar.e(this) : null;
        Notification notificationD = d();
        if (remoteViewsE != null) {
            notificationD.contentView = remoteViewsE;
        } else {
            RemoteViews remoteViews = this.f3294c.I;
            if (remoteViews != null) {
                notificationD.contentView = remoteViews;
            }
        }
        if (mVar != null && (remoteViewsD = mVar.d(this)) != null) {
            notificationD.bigContentView = remoteViewsD;
        }
        if (mVar != null && (remoteViewsF = this.f3294c.f3246q.f(this)) != null) {
            notificationD.headsUpContentView = remoteViewsF;
        }
        if (mVar != null && (extras = NotificationCompat.getExtras(notificationD)) != null) {
            mVar.a(extras);
        }
        return notificationD;
    }

    protected Notification d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f3293b.build();
        }
        Notification notificationBuild = this.f3293b.build();
        if (this.f3298g != 0) {
            if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) != 0 && this.f3298g == 2) {
                h(notificationBuild);
            }
            if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) == 0 && this.f3298g == 1) {
                h(notificationBuild);
            }
        }
        return notificationBuild;
    }

    Context f() {
        return this.f3292a;
    }
}

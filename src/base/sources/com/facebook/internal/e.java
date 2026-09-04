package com.facebook.internal;

import android.content.Intent;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements com.facebook.r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f15151b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f15152c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f15153a = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        boolean a(int i10, Intent intent);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final synchronized a b(int i10) {
            return (a) e.f15152c.get(Integer.valueOf(i10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(int i10, int i11, Intent intent) {
            a aVarB = b(i10);
            if (aVarB != null) {
                return aVarB.a(i11, intent);
            }
            return false;
        }

        public final synchronized void c(int i10, a callback) {
            kotlin.jvm.internal.s.h(callback, "callback");
            if (e.f15152c.containsKey(Integer.valueOf(i10))) {
                return;
            }
            e.f15152c.put(Integer.valueOf(i10), callback);
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum c {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8),
        GamingFriendFinder(9),
        GamingGroupIntegration(10),
        Referral(11),
        GamingContextCreate(12),
        GamingContextSwitch(13),
        GamingContextChoose(14),
        TournamentShareDialog(15),
        TournamentJoinDialog(16);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f15172a;

        c(int i10) {
            this.f15172a = i10;
        }

        public final int g() {
            return com.facebook.h0.s() + this.f15172a;
        }
    }

    public final void b(int i10, a callback) {
        kotlin.jvm.internal.s.h(callback, "callback");
        this.f15153a.put(Integer.valueOf(i10), callback);
    }

    @Override // com.facebook.r
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        a aVar = (a) this.f15153a.get(Integer.valueOf(i10));
        return aVar != null ? aVar.a(i11, intent) : f15151b.d(i10, i11, intent);
    }
}

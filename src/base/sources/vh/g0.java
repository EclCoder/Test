package vh;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
abstract class g0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface b {
        void a(Intent intent);

        void startActivityForResult(Intent intent, int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Activity f55597a;

        @Override // vh.g0.b
        public void a(Intent intent) {
            this.f55597a.startActivity(intent);
        }

        @Override // vh.g0.b
        public void startActivityForResult(Intent intent, int i10) {
            this.f55597a.startActivityForResult(intent, i10);
        }

        private c(Activity activity) {
            this.f55597a = activity;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Fragment f55598a;

        @Override // vh.g0.b
        public void a(Intent intent) {
            this.f55598a.startActivity(intent);
        }

        @Override // vh.g0.b
        public void startActivityForResult(Intent intent, int i10) {
            this.f55598a.startActivityForResult(intent, i10);
        }

        private d(Fragment fragment) {
            this.f55598a = fragment;
        }
    }

    static Intent a(Intent intent, Intent intent2) {
        if (intent == null && intent2 != null) {
            return intent2;
        }
        if (intent2 == null) {
            return intent;
        }
        b(intent).putExtra("sub_intent_key", intent2);
        return intent;
    }

    static Intent b(Intent intent) {
        Intent intentC = c(intent);
        return intentC != null ? b(intentC) : intent;
    }

    static Intent c(Intent intent) {
        return vh.c.f() ? (Intent) intent.getParcelableExtra("sub_intent_key", Intent.class) : (Intent) intent.getParcelableExtra("sub_intent_key");
    }

    static boolean d(Activity activity, Intent intent) {
        return e(new c(activity), intent);
    }

    static boolean e(b bVar, Intent intent) {
        try {
            bVar.a(intent);
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            Intent intentC = c(intent);
            if (intentC == null) {
                return false;
            }
            return e(bVar, intentC);
        }
    }

    static boolean f(Fragment fragment, Intent intent, int i10) {
        return g(new d(fragment), intent, i10);
    }

    static boolean g(b bVar, Intent intent, int i10) {
        try {
            bVar.startActivityForResult(intent, i10);
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            Intent intentC = c(intent);
            if (intentC == null) {
                return false;
            }
            return g(bVar, intentC, i10);
        }
    }
}

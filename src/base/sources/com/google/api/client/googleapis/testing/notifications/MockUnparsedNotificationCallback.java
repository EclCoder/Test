package com.google.api.client.googleapis.testing.notifications;

import com.google.api.client.googleapis.notifications.StoredChannel;
import com.google.api.client.googleapis.notifications.UnparsedNotification;
import com.google.api.client.googleapis.notifications.UnparsedNotificationCallback;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class MockUnparsedNotificationCallback implements UnparsedNotificationCallback {
    private static final long serialVersionUID = 0;
    private boolean wasCalled;

    @Override // com.google.api.client.googleapis.notifications.UnparsedNotificationCallback
    public void onNotification(StoredChannel storedChannel, UnparsedNotification unparsedNotification) {
        this.wasCalled = true;
    }

    public boolean wasCalled() {
        return this.wasCalled;
    }
}

package com.google.api.client.googleapis.notifications;

import com.google.api.client.http.HttpMediaType;
import com.google.api.client.util.ObjectParser;
import com.google.api.client.util.Preconditions;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class TypedNotificationCallback<T> implements UnparsedNotificationCallback {
    private static final long serialVersionUID = 1;

    protected abstract Class<T> getDataClass();

    protected abstract ObjectParser getObjectParser();

    protected abstract void onNotification(StoredChannel storedChannel, TypedNotification<T> typedNotification);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.api.client.googleapis.notifications.UnparsedNotificationCallback
    public final void onNotification(StoredChannel storedChannel, UnparsedNotification unparsedNotification) {
        TypedNotification typedNotification = new TypedNotification(unparsedNotification);
        String contentType = unparsedNotification.getContentType();
        if (contentType != null) {
            typedNotification.setContent(getObjectParser().parseAndClose(unparsedNotification.getContentStream(), new HttpMediaType(contentType).getCharsetParameter(), (Class) Preconditions.checkNotNull(getDataClass())));
        }
        onNotification(storedChannel, typedNotification);
    }
}

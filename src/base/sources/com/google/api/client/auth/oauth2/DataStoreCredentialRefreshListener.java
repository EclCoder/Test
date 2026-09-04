package com.google.api.client.auth.oauth2;

import com.google.api.client.util.Preconditions;
import com.google.api.client.util.store.DataStore;
import com.google.api.client.util.store.DataStoreFactory;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class DataStoreCredentialRefreshListener implements CredentialRefreshListener {
    private final DataStore<StoredCredential> credentialDataStore;
    private final String userId;

    public DataStoreCredentialRefreshListener(String str, DataStoreFactory dataStoreFactory) {
        this(str, StoredCredential.getDefaultDataStore(dataStoreFactory));
    }

    public DataStore<StoredCredential> getCredentialDataStore() {
        return this.credentialDataStore;
    }

    public void makePersistent(Credential credential) {
        this.credentialDataStore.set(this.userId, new StoredCredential(credential));
    }

    @Override // com.google.api.client.auth.oauth2.CredentialRefreshListener
    public void onTokenErrorResponse(Credential credential, TokenErrorResponse tokenErrorResponse) {
        makePersistent(credential);
    }

    @Override // com.google.api.client.auth.oauth2.CredentialRefreshListener
    public void onTokenResponse(Credential credential, TokenResponse tokenResponse) {
        makePersistent(credential);
    }

    public DataStoreCredentialRefreshListener(String str, DataStore<StoredCredential> dataStore) {
        this.userId = (String) Preconditions.checkNotNull(str);
        this.credentialDataStore = (DataStore) Preconditions.checkNotNull(dataStore);
    }
}

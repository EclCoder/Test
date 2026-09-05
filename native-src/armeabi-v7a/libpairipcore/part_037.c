// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 721-740
// ============================================================

// ============================================================
// Function #721
// Name: dlclose
// Address: 000a0470
// JNI: NO
// ============================================================


void dlclose(void)

{
  (*(code *)PTR_dlclose_000a5eac)();
  return;
}




// ============================================================
// Function #722
// Name: dlerror
// Address: 000a0480
// JNI: NO
// ============================================================


void dlerror(void)

{
  (*(code *)PTR_dlerror_000a5eb0)();
  return;
}




// ============================================================
// Function #723
// Name: dlopen
// Address: 000a0490
// JNI: NO
// ============================================================


void dlopen(void)

{
  (*(code *)PTR_dlopen_000a5eb4)();
  return;
}




// ============================================================
// Function #724
// Name: memchr
// Address: 000a04a0
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * memchr(void *__s,int __c,size_t __n)

{
  void *pvVar1;
  
  pvVar1 = (void *)(*(code *)PTR_memchr_000a5eb8)(__s);
  return pvVar1;
}




// ============================================================
// Function #725
// Name: __system_property_foreach
// Address: 000a04b0
// JNI: NO
// ============================================================


void __system_property_foreach(void)

{
  (*(code *)PTR___system_property_foreach_000a5ebc)();
  return;
}




// ============================================================
// Function #726
// Name: __aeabi_memcpy8
// Address: 000a04c0
// JNI: NO
// ============================================================


void __aeabi_memcpy8(void)

{
  (*(code *)PTR___aeabi_memcpy8_000a5ec0)();
  return;
}




// ============================================================
// Function #727
// Name: strcmp
// Address: 000a04d0
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int strcmp(char *__s1,char *__s2)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_strcmp_000a5ec4)(__s1);
  return iVar1;
}




// ============================================================
// Function #728
// Name: closedir
// Address: 000a04f0
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int closedir(DIR *__dirp)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_closedir_000a5ecc)(__dirp);
  return iVar1;
}




// ============================================================
// Function #729
// Name: malloc
// Address: 000a0500
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * malloc(size_t __size)

{
  void *pvVar1;
  
  pvVar1 = (void *)(*(code *)PTR_malloc_000a5ed0)(__size);
  return pvVar1;
}




// ============================================================
// Function #730
// Name: syscall
// Address: 000a0510
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

long syscall(long __sysno,...)

{
  long lVar1;
  
  lVar1 = (*(code *)PTR_syscall_000a5ed4)(__sysno);
  return lVar1;
}




// ============================================================
// Function #731
// Name: __aeabi_memmove
// Address: 000a0520
// JNI: NO
// ============================================================


void __aeabi_memmove(void)

{
  (*(code *)PTR___aeabi_memmove_000a5ed8)();
  return;
}




// ============================================================
// Function #732
// Name: fprintf
// Address: 000a0530
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int fprintf(FILE *__stream,char *__format,...)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_fprintf_000a5edc)(__stream);
  return iVar1;
}




// ============================================================
// Function #733
// Name: abort
// Address: 000a0540
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void abort(void)

{
  (*(code *)PTR_abort_000a5ee0)();
  return;
}




// ============================================================
// Function #734
// Name: pthread_mutex_destroy
// Address: 000a0550
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int pthread_mutex_destroy(pthread_mutex_t *__mutex)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_pthread_mutex_destroy_000a5ee4)(__mutex);
  return iVar1;
}




// ============================================================
// Function #735
// Name: fputc
// Address: 000a0560
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int fputc(int __c,FILE *__stream)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_fputc_000a5ee8)(__c);
  return iVar1;
}




// ============================================================
// Function #736
// Name: calloc
// Address: 000a0570
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * calloc(size_t __nmemb,size_t __size)

{
  void *pvVar1;
  
  pvVar1 = (void *)(*(code *)PTR_calloc_000a5eec)(__nmemb);
  return pvVar1;
}




// ============================================================
// Function #737
// Name: pthread_once
// Address: 000a0580
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int pthread_once(pthread_once_t *__once_control,__init_routine *__init_routine)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_pthread_once_000a5ef0)(__once_control);
  return iVar1;
}




// ============================================================
// Function #738
// Name: realloc
// Address: 000a0590
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * realloc(void *__ptr,size_t __size)

{
  void *pvVar1;
  
  pvVar1 = (void *)(*(code *)PTR_realloc_000a5ef4)(__ptr);
  return pvVar1;
}




// ============================================================
// Function #739
// Name: vasprintf
// Address: 000a05a0
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int vasprintf(char **__ptr,char *__f,__gnuc_va_list __arg)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_vasprintf_000a5ef8)(__ptr);
  return iVar1;
}




// ============================================================
// Function #740
// Name: pthread_cond_broadcast
// Address: 000a05b0
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int pthread_cond_broadcast(pthread_cond_t *__cond)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_pthread_cond_broadcast_000a5efc)(__cond);
  return iVar1;
}





/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00019e3a
 * Address  : 00019e3a
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined4 * FUN_00019e3a(undefined4 *param_1,char *param_2)

{
  size_t sVar1;
  size_t *psVar2;
  
  sVar1 = strlen(param_2);
  psVar2 = (size_t *)FUN_000a0370(sVar1 + 0xd);
  *psVar2 = sVar1;
  psVar2[1] = sVar1;
  psVar2[2] = 0;
  __aeabi_memcpy(psVar2 + 3,param_2,sVar1 + 1);
  *param_1 = psVar2 + 3;
  return param_1;
}



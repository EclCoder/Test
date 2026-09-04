/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00021f50
 * Address  : 00021f50
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int * FUN_00021f50(undefined4 *param_1)

{
  int iVar1;
  int *piVar2;
  int local_20;
  int *local_1c;
  
  if (((byte *)param_1[1] != (byte *)*param_1) && (0xfffffff5 < *(byte *)*param_1 - 0x3a)) {
    piVar2 = (int *)FUN_00021ed2(param_1);
    return piVar2;
  }
  iVar1 = FUN_0001bec0(param_1,DAT_0002202c + 0x21f78,2);
  if (iVar1 == 0) {
    FUN_0001bec0(param_1,DAT_00022034 + 0x21fa0,2);
    local_1c = (int *)FUN_000220bc(param_1,0);
    if (local_1c != (int *)0x0) {
      if ((char *)param_1[1] == (char *)*param_1) {
        return local_1c;
      }
      if (*(char *)*param_1 != 'I') {
        return local_1c;
      }
      local_20 = FUN_0001df74(param_1,0);
      if (local_20 == 0) {
        return (int *)0x0;
      }
      piVar2 = (int *)FUN_0001e168(param_1,&local_1c,&local_20);
      return piVar2;
    }
  }
  else {
    if (((byte *)param_1[1] == (byte *)*param_1) || (*(byte *)*param_1 - 0x3a < 0xfffffff6)) {
      iVar1 = FUN_00021e82(param_1);
    }
    else {
      iVar1 = FUN_00021ed2(param_1);
    }
    if (iVar1 != 0) {
      piVar2 = (int *)FUN_0001dbc0(param_1 + 0x66,0xc);
      *(undefined1 *)(piVar2 + 1) = 0x32;
      piVar2[2] = iVar1;
      *piVar2 = DAT_00022030 + 0x22014;
      *(ushort *)((int)piVar2 + 5) = (*(ushort *)((int)piVar2 + 5) & 0xf000) + 0x540;
      return piVar2;
    }
  }
  return (int *)0x0;
}



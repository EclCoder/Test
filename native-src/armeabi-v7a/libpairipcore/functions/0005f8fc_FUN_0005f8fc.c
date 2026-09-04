/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0005f8fc
 * Address  : 0005f8fc
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


/* WARNING: Type propagation algorithm not settling */

void FUN_0005f8fc(int *param_1)

{
  undefined4 ****ppppuVar1;
  pthread_key_t *ppVar2;
  pthread_key_t __key;
  undefined4 *******pppppppuVar3;
  undefined4 ******ppppppuVar4;
  undefined4 ******ppppppuVar5;
  undefined4 ******ppppppuVar6;
  int iVar7;
  undefined4 uVar8;
  void *__pointer;
  int iVar9;
  undefined4 ******ppppppuVar10;
  undefined4 ****ppppuVar11;
  undefined4 ******ppppppuVar12;
  undefined4 *****pppppuVar13;
  undefined4 *****pppppuVar14;
  undefined4 ******ppppppuVar15;
  int iVar16;
  undefined4 ******ppppppuVar17;
  uint uVar18;
  undefined4 ******ppppppuVar19;
  undefined4 *******pppppppuVar20;
  bool bVar21;
  undefined4 ******local_d4;
  undefined4 *******local_cc;
  undefined4 *******local_c8;
  undefined4 *******local_c4;
  undefined4 ****local_a0;
  undefined1 local_98 [40];
  undefined4 ****local_70;
  undefined4 *******local_68;
  char local_64;
  undefined4 ******local_60 [2];
  undefined4 local_58;
  uint local_48;
  uint local_44;
  undefined4 local_40;
  undefined4 ****local_38;
  byte local_30;
  int local_28;
  
  local_28 = **(int **)(DAT_000601d8 + 0x5f914);
  ppVar2 = (pthread_key_t *)FUN_0001aee0();
  __pointer = (void *)*param_1;
  __key = *ppVar2;
  *param_1 = 0;
  pthread_setspecific(__key,__pointer);
  pppppppuVar20 = (undefined4 *******)param_1[1];
  iVar16 = 0;
  pppppppuVar3 = pppppppuVar20 + 1;
LAB_0005f958:
  do {
    if (iVar16 == 1) break;
    if (iVar16 == 0) {
      local_64 = '\x01';
      local_68 = pppppppuVar3;
      FUN_0001ae24();
      ppppppuVar4 = pppppppuVar20[7];
      while (ppppppuVar4 == (undefined4 ******)0x0) {
        FUN_0001ade0(pppppppuVar20,&local_68);
        ppppppuVar4 = pppppppuVar20[7];
      }
      ppppppuVar4 = pppppppuVar20[6];
      local_38 = (undefined4 ****)0xffffffff;
      local_60[0] = (undefined4 ******)((uint)local_60[0] & 0xffffff00);
      ppppuVar11 = pppppppuVar20[3][(uint)ppppppuVar4 / 0x55][((uint)ppppppuVar4 % 0x55) * 0xc + 10]
      ;
      if (ppppuVar11 == (undefined4 ****)0xffffffff) {
        pppppuVar14 = pppppppuVar20[3][(uint)ppppppuVar4 / 0x55] +
                      ((uint)ppppppuVar4 % 0x55) * 0xc + 10;
        local_30 = 1;
      }
      else {
        local_cc = local_60;
        (**(code **)(DAT_000601dc + 0x5fa00 + (int)ppppuVar11 * 4))(&local_cc);
        ppppppuVar4 = pppppppuVar20[6];
        pppppuVar14 = pppppppuVar20[3][(uint)ppppppuVar4 / 0x55] +
                      ((uint)ppppppuVar4 % 0x55) * 0xc + 10;
        local_30 = 1;
        local_38 = ppppuVar11;
        if (*pppppuVar14 != (undefined4 ****)0xffffffff) {
          (**(code **)(DAT_000601e0 + 0x5fa50 + (int)*pppppuVar14 * 4))(&local_cc);
          ppppppuVar4 = pppppppuVar20[6];
        }
      }
      *pppppuVar14 = (undefined4 ****)0xffffffff;
      pppppppuVar20[6] = (undefined4 ******)((int)ppppppuVar4 + 1U);
      pppppppuVar20[7] = (undefined4 ******)((int)pppppppuVar20[7] + -1);
      if ((undefined4 ******)0xa9 < (undefined4 ******)((int)ppppppuVar4 + 1U)) {
        FUN_00023f68(*pppppppuVar20[3],0xff0);
        pppppppuVar20[3] = pppppppuVar20[3] + 1;
        pppppppuVar20[6] = (undefined4 ******)((int)pppppppuVar20[6] + -0x55);
      }
      ppppuVar11 = local_38;
      if (local_30 == 0) {
        FUN_000289c4();
      }
      else {
        local_a0 = (undefined4 ****)0xffffffff;
        local_c8 = (undefined4 *******)((uint)local_c8 & 0xffffff00);
        if (local_38 != (undefined4 ****)0xffffffff) {
          local_cc = &local_c8;
          (**(code **)(DAT_000601e4 + 0x5faf4 + (int)local_38 * 4))(&local_cc,local_60);
          local_a0 = ppppuVar11;
          bVar21 = (local_30 & 1) != 0;
          ppppuVar1 = (undefined4 ****)(uint)local_30;
          if (bVar21) {
            ppppuVar1 = local_38;
          }
          if (bVar21 && ppppuVar1 != (undefined4 ****)0xffffffff) {
            (**(code **)(DAT_000601e8 + 0x5fc68 + (int)ppppuVar1 * 4))(&local_cc,local_60);
          }
        }
        if (local_64 == '\x01') {
          FUN_0001ae3c(local_68);
        }
        ppppuVar11 = local_a0;
        local_38 = (undefined4 ****)0xffffffff;
        local_60[0] = (undefined4 ******)((uint)local_60[0] & 0xffffff00);
        if (local_a0 == (undefined4 ****)0xffffffff) {
          local_30 = 1;
        }
        else {
          local_68 = local_60;
          (**(code **)(DAT_000601ec + 0x5fb4c + (int)local_a0 * 4))(&local_68,&local_c8);
          local_38 = ppppuVar11;
          local_30 = 1;
          if (local_a0 != (undefined4 ****)0xffffffff) {
            (**(code **)(DAT_000601f0 + 0x5fb7c + (int)local_a0 * 4))(&local_68,&local_c8);
            iVar16 = 0;
            if ((local_30 & 1) == 0) goto LAB_0005f958;
          }
        }
        ppppuVar11 = local_38;
        local_70 = (undefined4 ****)0xffffffff;
        local_98[0] = 0;
        if (local_38 != (undefined4 ****)0xffffffff) {
          local_c8 = (undefined4 *******)local_98;
          (**(code **)(DAT_000601f4 + 0x5fbd0 + (int)local_38 * 4))(&local_c8,local_60);
          local_c8 = pppppppuVar20;
          local_c4 = pppppppuVar20;
          local_70 = ppppuVar11;
          local_68 = &local_c8;
          iVar16 = (**(code **)(DAT_000601f8 + 0x5fbec + (int)ppppuVar11 * 4))(&local_68,local_98);
          if (local_70 != (undefined4 ****)0xffffffff) {
            (**(code **)(DAT_000601fc + 0x5fc1c + (int)local_70 * 4))(&local_c8,local_98);
          }
          local_70 = (undefined4 ****)0xffffffff;
          bVar21 = (local_30 & 1) != 0;
          ppppuVar11 = (undefined4 ****)(uint)local_30;
          if (bVar21) {
            ppppuVar11 = local_38;
          }
          if (bVar21 && ppppuVar11 != (undefined4 ****)0xffffffff) {
            (**(code **)(DAT_00060200 + 0x5fc4c + (int)ppppuVar11 * 4))(&local_c8,local_60);
          }
          goto LAB_0005f958;
        }
      }
      local_c8 = pppppppuVar20;
      local_c4 = pppppppuVar20;
                    /* WARNING: Subroutine does not return */
      FUN_0006022c();
    }
  } while( true );
  FUN_0001ae24(pppppppuVar3);
  ppppppuVar4 = pppppppuVar20[7];
  FUN_0001ae3c(pppppppuVar3);
  if (ppppppuVar4 == (undefined4 ******)0x0) {
    local_d4 = (undefined4 ******)0x0;
    ppppppuVar5 = (undefined4 ******)0x0;
    iVar16 = DAT_00060204 + 0x5fd00;
  }
  else {
    iVar16 = DAT_00060208 + 0x5fcc4;
    if ((undefined4 ******)0x5555555 < ppppppuVar4) {
LAB_000601c0:
      FUN_0005eb64();
LAB_000601c4:
                    /* WARNING: Subroutine does not return */
      FUN_00026984();
    }
    ppppppuVar5 = (undefined4 ******)FUN_000a0370((int)ppppppuVar4 * 0x30);
    local_d4 = ppppppuVar5 + (int)ppppppuVar4 * 0xc;
  }
  FUN_0001ae24(pppppppuVar3);
  ppppppuVar4 = pppppppuVar20[7];
  if (ppppppuVar4 == (undefined4 ******)0x0) {
    FUN_0001ae3c(pppppppuVar3);
    if (ppppppuVar5 == (undefined4 ******)0x0) goto LAB_0006013c;
  }
  else {
    ppppppuVar6 = pppppppuVar20[6];
    ppppppuVar12 = (undefined4 ******)0x0;
    ppppppuVar10 = ppppppuVar5;
    ppppppuVar19 = ppppppuVar5;
    do {
      pppppuVar14 = pppppppuVar20[3][(uint)ppppppuVar6 / 0x55] +
                    ((uint)ppppppuVar6 / 0x55) * -0x3fc + (int)ppppppuVar6 * 0xc;
      if (ppppppuVar10 < local_d4) {
        ppppppuVar10[10] = (undefined4 *****)0xffffffff;
        *(undefined1 *)ppppppuVar10 = 0;
        pppppuVar13 = (undefined4 *****)pppppuVar14[10];
        ppppppuVar5 = ppppppuVar19;
        if (pppppuVar13 != (undefined4 *****)0xffffffff) {
          local_60[0] = ppppppuVar10;
          (**(code **)(DAT_0006020c + 0x5fd9c + (int)pppppuVar13 * 4))(local_60,pppppuVar14);
          ppppppuVar10[10] = pppppuVar13;
        }
      }
      else {
        iVar16 = (int)ppppppuVar10 - (int)ppppppuVar19 >> 4;
        uVar18 = iVar16 * -0x55555555 + 1;
        if (0x5555555 < uVar18) goto LAB_000601c0;
        iVar9 = (int)local_d4 - (int)ppppppuVar19;
        iVar7 = iVar9 >> 4;
        if (uVar18 < (uint)(iVar7 * 0x55555556)) {
          uVar18 = iVar7 * 0x55555556;
        }
        if (0x2aaaaa9 < (uint)(iVar7 * -0x55555555)) {
          uVar18 = 0x5555555;
        }
        if (uVar18 == 0) {
          iVar7 = 0;
        }
        else {
          if (0x5555555 < uVar18) goto LAB_000601c4;
          iVar7 = FUN_000a0370(uVar18 * 0x30);
        }
        ppppppuVar6 = (undefined4 ******)(iVar7 + iVar16 * 0x10);
        *(undefined1 *)ppppppuVar6 = 0;
        ppppppuVar6[10] = (undefined4 *****)0xffffffff;
        pppppuVar13 = (undefined4 *****)pppppuVar14[10];
        if (pppppuVar13 != (undefined4 *****)0xffffffff) {
          local_60[0] = ppppppuVar6;
          (**(code **)(DAT_00060210 + 0x5fe64 + (int)pppppuVar13 * 4))(local_60,pppppuVar14);
          ppppppuVar6[10] = pppppuVar13;
        }
        ppppppuVar5 = (undefined4 ******)
                      ((int)ppppppuVar6 - ((int)ppppppuVar10 - (int)ppppppuVar19));
        iVar16 = DAT_00060214 + 0x5fe8c;
        ppppppuVar15 = ppppppuVar5;
        ppppppuVar17 = ppppppuVar19;
        if (ppppppuVar19 != ppppppuVar10) {
          do {
            ppppppuVar15[10] = (undefined4 *****)0xffffffff;
            *(undefined1 *)ppppppuVar15 = 0;
            pppppuVar14 = ppppppuVar17[10];
            if (pppppuVar14 != (undefined4 *****)0xffffffff) {
              local_60[0] = ppppppuVar15;
              (**(code **)(DAT_00060218 + 0x5fed8 + (int)pppppuVar14 * 4))(local_60,ppppppuVar17);
              ppppppuVar15[10] = pppppuVar14;
            }
            ppppppuVar17 = ppppppuVar17 + 0xc;
            ppppppuVar15 = ppppppuVar15 + 0xc;
          } while (ppppppuVar17 != ppppppuVar10);
          iVar16 = DAT_0006021c + 0x5fefc;
          ppppppuVar15 = ppppppuVar19;
          do {
            if (ppppppuVar15[10] != (undefined4 *****)0xffffffff) {
              (**(code **)(iVar16 + (int)ppppppuVar15[10] * 4))(local_60,ppppppuVar15);
            }
            ppppppuVar15[10] = (undefined4 *****)0xffffffff;
            ppppppuVar15 = ppppppuVar15 + 0xc;
          } while (ppppppuVar15 != ppppppuVar10);
        }
        local_d4 = (undefined4 ******)(iVar7 + uVar18 * 0x30);
        ppppppuVar10 = ppppppuVar6;
        if (ppppppuVar19 != (undefined4 ******)0x0) {
          FUN_00023f68(ppppppuVar19,iVar9);
        }
      }
      ppppppuVar10 = ppppppuVar10 + 0xc;
      ppppppuVar6 = pppppppuVar20[6];
      pppppuVar14 = pppppppuVar20[3][(uint)ppppppuVar6 / 0x55] +
                    ((uint)ppppppuVar6 / 0x55) * -0x3fc + (int)ppppppuVar6 * 0xc;
      if (pppppuVar14[10] != (undefined4 ****)0xffffffff) {
        (**(code **)(iVar16 + (int)pppppuVar14[10] * 4))(local_60,pppppuVar14);
        ppppppuVar6 = pppppppuVar20[6];
      }
      pppppuVar14[10] = (undefined4 ****)0xffffffff;
      ppppppuVar6 = (undefined4 ******)((int)ppppppuVar6 + 1);
      pppppppuVar20[6] = ppppppuVar6;
      pppppppuVar20[7] = (undefined4 ******)((int)pppppppuVar20[7] + -1);
      if ((undefined4 ******)0xa9 < ppppppuVar6) {
        FUN_00023f68(*pppppppuVar20[3],0xff0);
        pppppppuVar20[3] = pppppppuVar20[3] + 1;
        ppppppuVar6 = (undefined4 ******)((int)pppppppuVar20[6] - 0x55);
        pppppppuVar20[6] = ppppppuVar6;
      }
      ppppppuVar12 = (undefined4 ******)((int)ppppppuVar12 + 1);
      ppppppuVar19 = ppppppuVar5;
    } while (ppppppuVar12 != ppppppuVar4);
    FUN_0001ae3c(pppppppuVar3);
    if (ppppppuVar5 != ppppppuVar10) {
      iVar16 = DAT_00060220 + 0x6001c;
      ppppppuVar4 = ppppppuVar5;
      do {
        if (ppppppuVar4[10] == (undefined4 *****)0xffffffff) {
                    /* WARNING: Subroutine does not return */
          FUN_0006022c();
        }
        local_c8 = &local_68;
        (**(code **)(iVar16 + (int)ppppppuVar4[10] * 4))(local_60,&local_c8,ppppppuVar4);
        uVar18 = local_44;
        if ((local_48 & 1) == 0) {
          uVar18 = local_48 >> 1 & 0x7f;
        }
        if (uVar18 != 0) {
          (*(code *)(*pppppppuVar20[8])[2])(pppppppuVar20[8],local_60);
        }
        if ((local_48 & 1) != 0) {
          FUN_00023f68(local_40,local_48 & 0xfffffffe);
        }
        if (((uint)local_60[0] & 1) != 0) {
          FUN_00023f68(local_58,(uint)local_60[0] & 0xfffffffe);
        }
        ppppppuVar4 = ppppppuVar4 + 0xc;
      } while (ppppppuVar4 != ppppppuVar10);
    }
    if (ppppppuVar5 == (undefined4 ******)0x0) goto LAB_0006013c;
    if (ppppppuVar5 != ppppppuVar10) {
      do {
        ppppppuVar4 = ppppppuVar10 + -0xc;
        if (ppppppuVar10[-2] != (undefined4 *****)0xffffffff) {
          (**(code **)(DAT_00060224 + 0x60104 + (int)ppppppuVar10[-2] * 4))(local_60,ppppppuVar4);
        }
        ppppppuVar10[-2] = (undefined4 *****)0xffffffff;
        ppppppuVar10 = ppppppuVar4;
      } while (ppppppuVar4 != ppppppuVar5);
    }
  }
  FUN_00023f68(ppppppuVar5,(int)local_d4 - (int)ppppppuVar5);
LAB_0006013c:
  FUN_0001ae24(pppppppuVar20 + 0xb);
  DataMemoryBarrier(0xb);
  *(undefined1 *)(pppppppuVar20 + 0xc) = 1;
  FUN_0001add0(pppppppuVar20 + 10);
  FUN_0001ae3c(pppppppuVar20 + 0xb);
  iVar16 = *param_1;
  *param_1 = 0;
  if (iVar16 != 0) {
    uVar8 = FUN_0001b008();
    FUN_00023f68(uVar8,4);
  }
  FUN_00023f68(param_1,8);
  if (**(int **)(DAT_00060228 + 0x601a4) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(local_28);
  }
  return;
}



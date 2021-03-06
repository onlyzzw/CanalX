package com.github.knightliao.canalx.core.plugin.injector;

import com.github.knightliao.canalx.core.plugin.injector.template.InjectorEventProcessTemplate;

/**
 * entry process aware
 *
 * @author knightliao
 * @date 2016/11/24 11:46
 */
public interface IInjectorEntryProcessorAware {

    void setupProcessEntry(InjectorEventProcessTemplate injectorEntryProcessTemplate);
}

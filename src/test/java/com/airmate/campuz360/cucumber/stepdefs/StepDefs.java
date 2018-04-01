package com.airmate.campuz360.cucumber.stepdefs;

import com.airmate.campuz360.Campuz360App;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = Campuz360App.class)
public abstract class StepDefs {

    protected ResultActions actions;

}

package hr.ferit.brunozoric.taskie.model.response

import hr.ferit.brunozoric.taskie.model.BackendTask

data class AddTaskResponse(val addedTask: BackendTask? = null)
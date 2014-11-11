<%@ page import="projetos.Projeto" %>



<div class="fieldcontain ${hasErrors(bean: projetoInstance, field: 'nome', 'error')} required">
	<label for="nome">
		<g:message code="projeto.nome.label" default="Nome" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nome" maxlength="128" required="" value="${projetoInstance?.nome}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: projetoInstance, field: 'descricao', 'error')} required">
	<label for="descricao">
		<g:message code="projeto.descricao.label" default="Descricao" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="descricao" cols="40" rows="5" maxlength="1024" required="" value="${projetoInstance?.descricao}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: projetoInstance, field: 'tarefas', 'error')} ">
	<label for="tarefas">
		<g:message code="projeto.tarefas.label" default="Tarefas" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${projetoInstance?.tarefas?}" var="t">
    <li><g:link controller="tarefa" action="show" id="${t.id}">${t?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="tarefa" action="create" params="['projeto.id': projetoInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'tarefa.label', default: 'Tarefa')])}</g:link>
</li>
</ul>


</div>

